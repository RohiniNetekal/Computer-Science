# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Spring Fundamentals

### Short explanation
Spring manages objects as beans and injects dependencies through IoC. This reduces manual object creation and improves testability.

### Handy example
```java
@Service
class OrderService {
    private final PaymentService paymentService;
    OrderService(PaymentService paymentService) { this.paymentService = paymentService; }
}
```

### Key point
Remember: Constructor injection makes required dependencies explicit.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] IoC
- [ ] Dependency Injection
- [ ] Beans
- [ ] Component scanning
- [ ] Constructor injection
- [ ] Bean scopes
- [ ] Configuration classes

## Concept in slightly more detail
Spring manages application objects and injects their dependencies, reducing manual object creation.

## Practical example
```java
@Service class OrderService { private final PaymentService p; OrderService(PaymentService p){this.p=p;} }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
