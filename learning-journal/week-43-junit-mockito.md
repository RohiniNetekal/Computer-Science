# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## JUnit & Mockito

### Short explanation
JUnit runs tests; Mockito replaces dependencies with controlled test doubles.

### Handy example
```java
when(paymentService.pay(100)).thenReturn(true);
assertTrue(orderService.placeOrder(100));
verify(paymentService).pay(100);
```

### Key point
Remember: Mock dependencies, not the class under test.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] JUnit lifecycle
- [ ] Assertions
- [ ] Parameterized tests
- [ ] Mockito mocks
- [ ] Stubbing
- [ ] verify
- [ ] Argument matchers
- [ ] Mock vs integration test

## Concept in slightly more detail
JUnit executes tests; Mockito isolates dependencies. Mock the dependency, not the class being tested.

## Practical example
```text
when(paymentService.pay(100)).thenReturn(true); verify(paymentService).pay(100);
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
