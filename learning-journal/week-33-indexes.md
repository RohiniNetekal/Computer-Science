# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Database Indexes

### Short explanation
An index helps the database locate rows without scanning the whole table, but indexes consume storage and add write cost.

### Handy example
```sql
CREATE INDEX idx_offer_merchant
ON offer_detail(merchant_id);
```

### Key point
Remember: Index columns used in selective filters/joins based on real query patterns.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
