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
