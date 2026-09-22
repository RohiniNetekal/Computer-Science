# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Fetch Strategies

### Short explanation
Lazy loading retrieves related data when accessed; eager loading retrieves it earlier. Poor fetch planning can cause N+1 queries.

### Handy example
```java
List<Order> orders = repository.findAll();
// Accessing each order's merchant may trigger extra queries with lazy loading.
```

### Key point
Remember: Inspect generated SQL instead of guessing how many queries execute.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
