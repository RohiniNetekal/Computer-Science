# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## REST Fundamentals

### Short explanation
REST APIs expose resources through HTTP. GET reads, POST creates, PUT replaces, PATCH partially updates, DELETE removes.

### Handy example
```http
GET /api/orders/101
POST /api/orders
Content-Type: application/json
```

### Key point
Remember: Use HTTP status codes to communicate the result clearly.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] HTTP methods
- [ ] Status codes
- [ ] Resource naming
- [ ] Path/query parameters
- [ ] Headers
- [ ] Idempotency
- [ ] Request/response JSON
- [ ] Pagination basics

## Concept in slightly more detail
REST APIs expose resources over HTTP. Learn correct verbs, status codes and clean resource-oriented URLs.

## Practical example
```java
GET /api/orders/101
POST /api/orders
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
