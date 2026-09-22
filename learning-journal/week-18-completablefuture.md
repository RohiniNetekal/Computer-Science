# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## CompletableFuture

### Short explanation
CompletableFuture composes asynchronous operations without manually coordinating threads.

### Handy example
```java
CompletableFuture<String> future =
    CompletableFuture.supplyAsync(() -> "merchant")
        .thenApply(String::toUpperCase);
System.out.println(future.join());
```

### Key point
Remember: thenApply transforms a result; thenCompose chains another future.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
