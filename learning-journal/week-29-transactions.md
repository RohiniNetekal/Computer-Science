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
