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


## What to cover
- [ ] B-tree concept
- [ ] Selectivity
- [ ] Single-column indexes
- [ ] Composite indexes
- [ ] Column order
- [ ] Covering/index-only concept
- [ ] Write overhead
- [ ] When indexes are not useful

## Concept in slightly more detail
Indexes can reduce row scanning but consume storage and slow writes. Choose them from real query patterns.

## Practical example
```text
CREATE INDEX idx_offer_merchant ON offer_detail(merchant_id);
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
