# SQL Query Optimization — Practical Checklist


~~~sql
SELECT merchant_id, COUNT(*) AS txn_count
FROM transaction_history
WHERE transaction_time >= :from_time
  AND transaction_time < :to_time
  AND status = :status
GROUP BY merchant_id;
~~~

## Optimization checklist

1. Check the execution plan rather than guessing.
2. Verify that predicates are selective enough.
3. Avoid applying functions to indexed columns when it prevents index usage.
4. Select only the columns required by the API/report.
5. Review join conditions and join cardinality.
6. Check indexes against real query patterns.
7. Avoid fetching millions of rows when pagination or batching is possible.
8. Compare logical reads, elapsed time, and returned rows before/after a change.

## Index thought process

~~~sql
CREATE INDEX idx_txn_status_time
ON transaction_history(status, transaction_time);
~~~

The correct index depends on data distribution and workload. Always validate with the actual execution plan.

This is learning material; no production schema or client data is included.
