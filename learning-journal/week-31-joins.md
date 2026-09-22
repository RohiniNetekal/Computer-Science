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


## What to cover
- [ ] INNER JOIN
- [ ] LEFT JOIN
- [ ] RIGHT JOIN
- [ ] Self join concept
- [ ] Join conditions
- [ ] Duplicate rows
- [ ] Join order concepts
- [ ] NULL behavior

## Concept in slightly more detail
Joins combine related rows. Incorrect join conditions can multiply rows.

## Practical example
```sql
SELECT m.merchant_id,o.offer_id FROM merchant_details m LEFT JOIN offer_detail o ON o.merchant_id=m.merchant_id;
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
