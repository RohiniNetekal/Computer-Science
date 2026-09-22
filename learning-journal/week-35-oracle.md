# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Oracle Basics

### Short explanation
Oracle provides sequences, timestamps, constraints and database-specific SQL features.

### Handy example
```sql
CREATE SEQUENCE offer_seq START WITH 1 INCREMENT BY 1;
SELECT offer_seq.NEXTVAL FROM dual;
```

### Key point
Remember: Know Oracle data types and timestamp behavior when debugging production SQL.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Sequences
- [ ] NUMBER
- [ ] VARCHAR2
- [ ] DATE/TIMESTAMP
- [ ] Constraints
- [ ] MERGE concept
- [ ] DUAL
- [ ] Transactions
- [ ] Common Oracle errors

## Concept in slightly more detail
Oracle has database-specific features and data types important in enterprise Java systems.

## Practical example
```text
CREATE SEQUENCE offer_seq START WITH 1 INCREMENT BY 1;
SELECT offer_seq.NEXTVAL FROM dual;
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
