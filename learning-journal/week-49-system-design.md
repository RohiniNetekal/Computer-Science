# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## System Design Basics

### Short explanation
System design starts with requirements, then APIs, data, scaling, reliability and bottlenecks.

### Handy example
```text
Client -> Load Balancer -> API -> Cache
                         |       |
                         v       v
                       DB      Queue -> Worker
```

### Key point
Remember: Explain trade-offs rather than claiming one architecture fits every system.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Requirements
- [ ] Functional/non-functional requirements
- [ ] API design
- [ ] Data model
- [ ] Caching
- [ ] Queues
- [ ] Scaling
- [ ] Load balancing
- [ ] Availability
- [ ] Bottlenecks
- [ ] Trade-offs

## Concept in slightly more detail
System design connects requirements to APIs, data, scaling and reliability. Explain trade-offs rather than one universal architecture.

## Practical example
```text
Client -> Load Balancer -> API -> Cache/DB -> Queue -> Worker
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
