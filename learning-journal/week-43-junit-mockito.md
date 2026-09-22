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
