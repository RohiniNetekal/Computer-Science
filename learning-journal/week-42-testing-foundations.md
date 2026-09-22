# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Testing Foundations

### Short explanation
Unit tests isolate a small unit; integration tests verify multiple real components together.

### Handy example
```java
@Test
void totalIsCalculated() {
    assertEquals(200, service.total(100, 2));
}
```

### Key point
Remember: A good test is deterministic, focused and easy to understand.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Unit tests
- [ ] Integration tests
- [ ] Test isolation
- [ ] Arrange/Act/Assert
- [ ] Assertions
- [ ] Test data
- [ ] Determinism
- [ ] Test naming

## Concept in slightly more detail
Unit tests isolate a small unit; integration tests verify multiple real components together.

## Practical example
```text
@Test void totalIsCalculated(){ assertEquals(200,service.total(100,2)); }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
