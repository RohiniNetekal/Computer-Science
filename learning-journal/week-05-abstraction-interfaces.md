# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Abstraction & Interfaces

### Short explanation
Abstraction exposes what an object does without forcing callers to know how. Interfaces define contracts.

### Handy example
```java
interface PaymentService {
    void pay(double amount);
}
class UpiPayment implements PaymentService {
    public void pay(double amount) { System.out.println(amount); }
}
```

### Key point
Remember: Program against an interface when you want replaceable implementations.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover in this topic
- [ ] Abstract classes
- [ ] Interfaces
- [ ] implements keyword
- [ ] Multiple interfaces
- [ ] Default/static interface methods
- [ ] Functional interfaces
- [ ] Programming to interfaces

## Concept in slightly more detail
Abstraction hides implementation details behind a contract. Interfaces are useful for replaceable implementations and dependency injection.

## Practical example
```java
interface Payment { void pay(BigDecimal amount); }
class UpiPayment implements Payment {
    public void pay(BigDecimal amount) { System.out.println(amount); }
}
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced


## What to cover
- [ ] Abstract classes
- [ ] Interfaces
- [ ] implements
- [ ] Multiple interfaces
- [ ] Default methods
- [ ] Functional interfaces
- [ ] Programming to interfaces

## Concept in slightly more detail
Abstraction exposes a contract while hiding implementation details.

## Practical example
```java
interface Payment { void pay(BigDecimal amount); }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
