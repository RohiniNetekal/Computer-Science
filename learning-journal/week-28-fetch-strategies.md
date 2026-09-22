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


## What to cover
- [ ] Lazy vs eager
- [ ] N+1 problem
- [ ] Fetch joins
- [ ] Entity graphs concept
- [ ] Batch fetching concept
- [ ] SQL inspection
- [ ] DTO projections

## Concept in slightly more detail
Fetching strategy controls when related data is loaded. N+1 happens when one query loads parents and extra queries load each child.

## Practical example
```sql
List<Order> orders=repository.findAll(); // inspect SQL before accessing related data
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
