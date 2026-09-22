# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## SQL Joins

### Short explanation
Joins combine rows from related tables. INNER keeps matches; LEFT keeps all rows from the left table plus matches.

### Handy example
```sql
SELECT m.merchant_id, o.offer_id
FROM merchant_details m
LEFT JOIN offer_detail o
  ON o.merchant_id = m.merchant_id;
```

### Key point
Remember: Incorrect join conditions can multiply rows unexpectedly.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
