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
