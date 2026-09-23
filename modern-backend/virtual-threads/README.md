# Virtual Threads — Java Backend Example

Virtual threads are lightweight Java threads designed to make a large number of concurrent tasks practical, especially when those tasks spend significant time waiting on blocking I/O such as HTTP calls or database operations.

This example uses `Executors.newVirtualThreadPerTaskExecutor()` to give each submitted task its own virtual thread.

## Why this matters for backend developers

Traditional platform threads are relatively expensive. A backend that creates a large number of blocking tasks can therefore become constrained by the number of platform threads available.

Virtual threads change the scaling model for **I/O-heavy concurrency**:

```text
Incoming requests
       |
       +--> virtual thread -> DB call
       +--> virtual thread -> HTTP call
       +--> virtual thread -> DB call
       +--> virtual thread -> HTTP call
```

The goal is not to make CPU-heavy code execute faster. If the application is CPU-bound, the number of available CPU cores remains the important constraint.

## Example

`VirtualThreadDemo.java` submits several simulated blocking merchant lookups:

```java
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    List<Future<String>> futures = merchantIds.stream()
            .map(id -> executor.submit(() -> loadMerchant(id)))
            .toList();
}
```

Each task can block without requiring the application to maintain a large pool of expensive platform threads.

## Virtual threads vs traditional thread pools

| Traditional approach | Virtual-thread approach |
|---|---|
| Fixed platform-thread pool | One virtual thread per task can be practical |
| Pool size limits concurrent blocking tasks | Many waiting tasks can be represented cheaply |
| Common tuning problem: pool size | Focus shifts toward downstream capacity and resource limits |
| Useful for many workloads | Particularly useful for blocking I/O workloads |

## Important backend considerations

Virtual threads do **not** remove bottlenecks.

A service can still be limited by:

- Database connection-pool size
- Downstream API capacity
- CPU
- Memory
- Rate limits
- External service latency
- Lock contention

For example, changing a service from a 50-thread pool to thousands of virtual threads does not mean the database can suddenly handle thousands of simultaneous connections.

A good design still uses bounded resources such as database connection pools and appropriate timeouts.

## Virtual threads and blocking I/O

A useful mental model is:

```text
Request
  |
  v
Virtual Thread
  |
  +---- application work
  |
  +---- blocking I/O
           |
           v
      resource wait
           |
           v
     continue work
```

This can make straightforward synchronous code scale better for high-concurrency I/O workloads without requiring every operation to be rewritten into callback-heavy asynchronous code.

## When to consider them

Good candidates:
- REST APIs with many concurrent requests
- Services making blocking HTTP calls
- Database-heavy request flows
- Gateway/integration services
- High-concurrency I/O workloads

Be cautious when:
- Work is CPU-bound
- A downstream system has strict concurrency limits
- Code relies heavily on thread-local assumptions
- A library is not suitable for the concurrency model

## Interview questions

### 1. Are virtual threads faster than platform threads?
Not necessarily. Their main benefit is scalability for large numbers of concurrent tasks, particularly blocking I/O workloads.

### 2. Should every application immediately switch to virtual threads?
No. The workload, libraries, downstream limits and operational characteristics should be evaluated first.

### 3. Do virtual threads remove the need for connection pools?
No. A database still has a finite number of connections and must be protected from excessive concurrency.

### 4. Are virtual threads useful for CPU-bound work?
They do not create additional CPU capacity. CPU-bound work remains limited by available processors and scheduling.

### 5. What Java version is this example aimed at?
Java 21 or later, where virtual threads are a permanent Java feature.

## Related topics to learn next

- ExecutorService
- CompletableFuture
- Structured concurrency
- Thread pools
- Database connection pools
- Timeouts and retries
- Spring Boot request concurrency
- Performance testing
- JVM monitoring
