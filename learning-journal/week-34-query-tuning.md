# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Query Tuning Basics

### Short explanation
Query tuning starts by understanding the execution plan and reducing unnecessary work.

### Handy example
```sql
SELECT merchant_id, status
FROM offer_detail
WHERE merchant_id = :merchantId;
```

### Key point
Remember: Avoid SELECT * when only a few columns are needed; verify improvements with execution plans.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
