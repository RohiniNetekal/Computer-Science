# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Microservices Basics

### Short explanation
A microservice owns a focused business capability and communicates with other services through APIs or messaging.

### Handy example
```text
Client -> Offer Service -> Merchant Service
                    -> Database
```

### Key point
Remember: A distributed system adds network failures, deployment coordination and observability concerns.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Service boundaries
- [ ] API communication
- [ ] Database ownership
- [ ] Configuration
- [ ] Service discovery concept
- [ ] Failure points
- [ ] Distributed transactions
- [ ] Observability

## Concept in slightly more detail
Microservices split business capabilities into independently deployable services, adding network and operational complexity.

## Practical example
```text
Client -> Offer Service -> Merchant Service -> Database
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
