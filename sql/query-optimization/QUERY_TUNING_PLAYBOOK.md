# SQL Query Tuning Playbook — Java Backend Perspective

SQL performance is part of backend engineering because a slow database operation often appears to the user as a slow API. The right approach is to measure first, inspect the query plan, understand the data access pattern, and then make a targeted change.

> Examples use Oracle-oriented terminology where useful. The examples are for learning and do not represent any employer/client query or schema.

## 1. Start from the API symptom

Do not begin by adding an index just because an API is slow.

```text
Slow API
   |
   +--> controller/service timing
   |
   +--> database call timing
   |
   +--> SQL text + bind values
   |
   +--> execution plan
   |
   +--> rows read vs rows returned
   |
   +--> index / join / sort / network analysis
```

A 3-second API does not automatically mean the SQL takes 3 seconds. Time can also be spent in connection acquisition, application processing, serialization, remote calls or lock waits.

## 2. Example problem

Suppose an API returns recent transactions for one merchant:

```sql
SELECT transaction_id,
       merchant_id,
       status,
       amount,
       created_at
FROM transaction_history
WHERE merchant_id = :merchant_id
  AND created_at >= :from_time
ORDER BY created_at DESC;
```

Before changing anything, ask:

- How many rows are in the table?
- How many rows normally match one merchant?
- Is `merchant_id` selective enough?
- How many rows are returned to the application?
- Does the query sort a large intermediate result?
- Is the predicate using a function on the indexed column?
- What does the actual execution plan show?

## 3. Execution plan mindset

An execution plan describes how the database intends to access and combine data.

Typical operations worth recognizing:

- Table access/full scan
- Index range scan
- Index unique scan
- Table access by rowid
- Nested loops
- Hash join
- Sort
- Aggregation

A full table scan is **not automatically bad**. If a query needs a large percentage of a small table, scanning it may be cheaper than repeatedly using an index.

The question is whether the chosen plan is appropriate for the query, data volume and selectivity.

## 4. Indexes: what they solve

An index can reduce the amount of data the database must inspect for selective predicates.

For the example query, a composite index might be worth evaluating:

```sql
CREATE INDEX idx_txn_merchant_created
    ON transaction_history (merchant_id, created_at);
```

The column order matters. The database can often use the leading portion of a composite index efficiently.

Do not blindly create indexes because indexes also have costs:

- Additional storage
- Extra work during INSERT/UPDATE/DELETE
- More objects for the optimizer to consider
- Maintenance overhead

## 5. Function on an indexed column

A common performance issue is applying a function to a column in the predicate.

Potentially problematic pattern:

```sql
WHERE TRUNC(created_at) = :business_date
```

Depending on the database and available indexes, this may prevent efficient use of a normal index on `created_at`.

A range predicate is often a better design for timestamp columns:

```sql
WHERE created_at >= :start_time
  AND created_at <  :end_time
```

This also avoids ambiguity around timestamp precision.

## 6. Avoid fetching unnecessary data

Avoid:

```sql
SELECT *
FROM transaction_history
WHERE merchant_id = :merchant_id;
```

when the API needs only three columns.

Prefer:

```sql
SELECT transaction_id,
       amount,
       status
FROM transaction_history
WHERE merchant_id = :merchant_id;
```

Benefits include less database work, less network transfer and less object mapping in the application.

## 7. Pagination is a database concern too

An API may expose:

```text
GET /transactions?page=0&size=50
```

but the database still needs an efficient way to locate the requested rows.

For large datasets, investigate the cost of high offsets and consider keyset/seek pagination where the access pattern supports it.

Conceptually:

```sql
SELECT transaction_id,
       created_at,
       amount
FROM transaction_history
WHERE merchant_id = :merchant_id
  AND (created_at, transaction_id) < (:last_created_at, :last_id)
ORDER BY created_at DESC, transaction_id DESC
FETCH FIRST 50 ROWS ONLY;
```

The second column helps make ordering deterministic when timestamps are equal.

## 8. Join performance

Consider:

```sql
SELECT o.order_id,
       m.merchant_name
FROM orders o
JOIN merchant m
  ON m.merchant_id = o.merchant_id
WHERE o.status = :status;
```

Investigate:

- Join columns
- Filtering before joining where appropriate
- Cardinality estimates
- Available indexes
- Number of rows flowing between operations
- Whether the selected join strategy fits the data

Do not assume nested loops or hash joins are universally better. The optimizer chooses based on its estimates and the available access paths.

## 9. N+1 from the application layer

A query can be individually fast and the overall API can still be slow.

Example:

```text
1 query -> load 500 orders
500 queries -> load merchant for each order
```

This is an application/database interaction problem rather than simply a slow SQL statement.

Possible solutions depend on the use case:

- Fetch join
- Projection
- Entity graph
- Batch fetching
- Explicit bulk query

The goal is to reduce unnecessary round trips without loading a huge object graph.

## 10. Query tuning checklist

Before changing a query:

- [ ] Reproduce the slow case
- [ ] Measure database time separately from API time
- [ ] Capture the actual SQL and bind values safely
- [ ] Inspect the execution plan
- [ ] Check estimated vs actual row counts where available
- [ ] Check indexes and column statistics
- [ ] Check joins and sort/aggregation operations
- [ ] Check whether too many rows/columns are fetched
- [ ] Check connection pool and lock/wait behavior
- [ ] Make one targeted change
- [ ] Re-measure with representative data

## 11. Common mistakes

### Mistake 1: Adding indexes everywhere
Indexes help reads but can increase write cost and storage.

### Mistake 2: Assuming every full scan is a bug
A scan can be optimal for a small table or a query returning most rows.

### Mistake 3: Measuring only from Postman
API latency includes more than SQL execution.

### Mistake 4: Optimizing with tiny test data
A query that is fast on 1,000 rows may behave differently at 100 million rows.

### Mistake 5: Ignoring bind values/selectivity
The same SQL shape can behave differently for different parameter values and data distributions.

### Mistake 6: Selecting everything
Unnecessary columns increase I/O, transfer and mapping cost.

## 12. Backend troubleshooting example

```text
Users report: transaction API is slow
          |
          v
Measure API: 4.2 s
          |
          v
SQL call: 3.8 s
          |
          v
Inspect plan
          |
          +--> large scan
          +--> expensive sort
          +--> many rows filtered after access
          |
          v
Review predicate + index design
          |
          v
Change query/index
          |
          v
Test with production-like data
          |
          v
Compare latency + logical/physical work
```

The important engineering habit is to prove that the change improved the real workload instead of relying on intuition.

## Interview questions

### Q1. Is a full table scan always bad?
No. It can be efficient when the table is small or when a large proportion of rows must be read.

### Q2. Why does composite index column order matter?
Because the leading columns determine which access patterns can efficiently use the index. The correct order depends on the predicates, selectivity and query workload.

### Q3. Why can `SELECT *` hurt performance?
It can read and transfer columns the application does not need and can increase mapping overhead.

### Q4. How do you investigate a slow SQL query?
Reproduce it, measure it, inspect the execution plan and actual row behavior, check indexes/statistics/joins/waits, make a targeted change, then benchmark again with representative data.

### Q5. How is N+1 different from a slow query?
N+1 is usually many database round trips caused by application access patterns. Each individual query may be fast while the total interaction is expensive.

### Q6. When would you consider keyset pagination?
When the dataset is large and the API repeatedly requests later pages ordered by a stable indexed key, making offset scans increasingly expensive.

## Practice exercises

1. Compare a query with and without a selective index.
2. Rewrite a timestamp predicate using a half-open range.
3. Find the latest transaction per merchant using a window function.
4. Compare offset pagination with keyset pagination.
5. Identify an N+1 pattern in a Hibernate example.
6. Read an Oracle execution plan and explain each major operation.
7. Measure an API before and after a SQL optimization and document the evidence.
