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
