# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Concurrency Basics

### Short explanation
Concurrency lets multiple tasks make progress independently. ExecutorService manages a pool of worker threads.

### Handy example
```java
ExecutorService pool = Executors.newFixedThreadPool(2);
pool.submit(() -> System.out.println("Task"));
pool.shutdown();
```

### Key point
Remember: Shared mutable state creates race-condition risk.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Thread vs process
- [ ] Runnable/Callable
- [ ] ExecutorService
- [ ] Thread pools
- [ ] Future
- [ ] Race conditions
- [ ] synchronized
- [ ] Atomic variables
- [ ] Concurrent collections

## Concept in slightly more detail
Concurrency introduces shared-state and coordination problems. Learn task execution, then synchronization and thread-safe structures.

## Practical example
```java
ExecutorService pool=Executors.newFixedThreadPool(2); Future<Integer> f=pool.submit(()->10+20);
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
