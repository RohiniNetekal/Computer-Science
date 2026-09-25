# Advanced SQL & Query Tuning Lab

This module focuses on SQL skills that matter when a Java backend is responsible for reading and updating large datasets.

The goal is to move beyond writing a query that returns the right rows and learn to reason about correctness, cardinality, execution plans, indexes, pagination and production performance.

> Independent learning/demo material. Examples are generic and do not reproduce employer SQL or data.

## Latest record per business key

A common backend requirement is to return the latest record for every merchant. A window function can rank rows inside each merchant group, then the outer query keeps rank 1.

Example pattern:

    ROW_NUMBER() OVER (
        PARTITION BY merchant_id
        ORDER BY transaction_time DESC, transaction_id DESC
    )

The secondary ordering makes the result deterministic when timestamps are equal.

## Top-N per group

To return the top three records by amount for every merchant, use ROW_NUMBER with PARTITION BY merchant_id and ORDER BY amount DESC.

This differs from a global FETCH FIRST 3, which returns only three rows across the entire dataset.

## Aggregation vs window functions

GROUP BY reduces rows and is appropriate when the result should contain one row per group.

A window function can calculate an aggregate while retaining the original rows.

This distinction is important for reporting APIs where both detail and group-level totals may be required.

## Duplicate detection

A common pattern is grouping by the business key and using HAVING COUNT(*) > 1.

For payment-like systems, duplicate detection should connect to the application's idempotency strategy rather than remain only a reporting query.

## Pagination

Offset pagination is easy to implement but can become expensive for deep pages because the database may need to scan and skip many earlier rows.

Keyset/seek pagination uses the last seen ordering key instead. For example, a transaction API can continue from the previous transaction_time and transaction_id rather than repeatedly skipping earlier rows.

## Index reasoning

An index is not automatically a performance improvement.

Before adding one, ask:

1. What query pattern is slow?
2. How many rows are returned?
3. What does the execution plan show?
4. Is the predicate selective?
5. Is the column frequently updated?
6. What write and storage cost will the index add?
7. Does the column order match the query pattern?

For a query filtering by merchant_id and a transaction-time range and then sorting by transaction_time, a composite index may be worth evaluating. The execution plan and real workload should drive the decision.

## Production query investigation

    Slow API
       |
       +--> application/service timing
       |
       +--> database call timing
               |
               +--> SQL and bind values
               +--> execution plan
               +--> rows examined/returned
               +--> join strategy
               +--> sort/temp work
               +--> index effectiveness

Do not assume the database is always the bottleneck. Connection-pool exhaustion, network latency, application locking and downstream calls can produce similar symptoms.

## Java/Hibernate connection

    Java service
       |
    Hibernate/JPA
       |
    Generated SQL
       |
    Execution plan
       |
    Database

Useful questions:
- Did Hibernate generate an unexpected query?
- Is there an N+1 query?
- Are unnecessary columns being loaded?
- Is pagination actually applied?
- Is a lazy relationship triggering extra queries?
- Is the transaction holding a connection longer than necessary?

## Interview questions

1. GROUP BY vs window function?
2. How do you find the latest row per group?
3. Why can OFFSET pagination become expensive?
4. How do you investigate a slow SQL query?
5. Why does adding an index not always make a query faster?
6. How can Hibernate create an N+1 problem?
7. What does an execution plan tell you?
8. How do you choose the column order of a composite index?

## Practice checklist

- [ ] Latest row per group
- [ ] Top-N per group
- [ ] Duplicate detection
- [ ] Running totals
- [ ] Window functions
- [ ] Keyset pagination
- [ ] Composite index reasoning
- [ ] Execution-plan interpretation
- [ ] Hibernate-to-SQL troubleshooting
- [ ] Query performance case study
