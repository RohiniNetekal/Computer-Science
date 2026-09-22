# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Immutability

### Short explanation
An immutable object cannot change after construction. Defensive copies prevent callers from mutating internal collections.

### Handy example
```java
final class Order {
    private final List<String> items;
    Order(List<String> items) { this.items = List.copyOf(items); }
    List<String> items() { return items; }
}
```

### Key point
Remember: final reference prevents reassignment; it does not automatically make the referenced object immutable.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] final fields
- [ ] Immutable class
- [ ] Defensive copies
- [ ] Unmodifiable collections
- [ ] List.copyOf
- [ ] Nested mutable objects
- [ ] Concurrency benefits

## Concept in slightly more detail
Immutable objects do not change after construction and are easier to reason about and share.

## Practical example
```java
this.items=List.copyOf(items);
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
