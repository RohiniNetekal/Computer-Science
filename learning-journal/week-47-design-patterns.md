# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Design Patterns

### Short explanation
Patterns are reusable design ideas. Strategy selects behavior; Factory centralizes creation; Builder simplifies complex construction.

### Handy example
```java
interface PaymentStrategy { void pay(BigDecimal amount); }
class UpiStrategy implements PaymentStrategy {
    public void pay(BigDecimal amount) { /* ... */ }
}
```

### Key point
Remember: Use a pattern when it makes the design clearer; do not add patterns just for their names.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
