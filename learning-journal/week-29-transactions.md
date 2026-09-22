# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Transactions

### Short explanation
A transaction groups database operations into one unit of work. Rollback prevents partial updates when a failure occurs.

### Handy example
```java
@Transactional
public void transfer(Long from, Long to, BigDecimal amount) {
    debit(from, amount);
    credit(to, amount);
}
```

### Key point
Remember: Put the transaction boundary around the business operation that must be atomic.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] ACID
- [ ] Transaction boundary
- [ ] Commit/rollback
- [ ] Propagation concept
- [ ] Isolation levels
- [ ] Read-only transactions
- [ ] Checked exception rollback considerations

## Concept in slightly more detail
A transaction groups database work into an atomic unit. Put the boundary around the business operation that must succeed or fail together.

## Practical example
```sql
@Transactional public void transfer(Long a,Long b,BigDecimal amount){ debit(a,amount); credit(b,amount); }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
