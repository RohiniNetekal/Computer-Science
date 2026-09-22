# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## SQL Foundations

### Short explanation
SQL reads and changes relational data. WHERE filters rows; ORDER BY sorts the result; NULL needs explicit handling.

### Handy example
```sql
SELECT merchant_id, status
FROM merchant_details
WHERE status = 'ACTIVE'
ORDER BY merchant_id;
```

### Key point
Remember: SQL describes what data you want; the database optimizer decides how to retrieve it.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
