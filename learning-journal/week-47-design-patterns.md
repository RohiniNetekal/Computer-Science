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


## What to cover
- [ ] Strategy
- [ ] Factory
- [ ] Builder
- [ ] Observer concept
- [ ] Factory vs dependency injection
- [ ] When patterns help
- [ ] Avoiding overengineering

## Concept in slightly more detail
Patterns are reusable design ideas. Use them when they clarify change points rather than for pattern-name coverage.

## Practical example
```text
interface PaymentStrategy { void pay(BigDecimal amount); }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
