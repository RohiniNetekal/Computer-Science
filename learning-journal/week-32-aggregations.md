# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## SQL Aggregations

### Short explanation
GROUP BY forms groups; aggregate functions calculate values per group; HAVING filters groups.

### Handy example
```sql
SELECT merchant_id, COUNT(*) AS offer_count
FROM offer_detail
GROUP BY merchant_id
HAVING COUNT(*) > 5;
```

### Key point
Remember: WHERE filters rows before grouping; HAVING filters groups after grouping.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] GROUP BY
- [ ] HAVING
- [ ] COUNT
- [ ] SUM
- [ ] AVG
- [ ] MIN/MAX
- [ ] Conditional aggregation
- [ ] WHERE vs HAVING

## Concept in slightly more detail
GROUP BY creates groups and aggregate functions calculate values per group.

## Practical example
```sql
SELECT merchant_id,COUNT(*) FROM offer_detail GROUP BY merchant_id HAVING COUNT(*)>5;
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
