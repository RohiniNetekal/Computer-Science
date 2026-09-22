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
