# Backend Caching Fundamentals

Caching is a performance technique in which frequently requested data is kept in a faster-access layer so the application does not repeatedly perform the same expensive work.

This module is **learning/demo material**. It does not claim production Redis experience.

## Why caching matters

Consider an API that repeatedly loads merchant configuration from a database:

```text
Client
  |
  v
GET /merchants/101/config
  |
  v
Service
  |
  +---- cache hit ----> return quickly
  |
  +---- cache miss ---> Database ---> store result ---> return
```

Without caching, every request may execute the same database query. With a suitable cache, repeated reads can avoid database work and reduce latency.

## Cache-aside pattern

The most common application-side pattern is **cache-aside**:

```text
1. Application receives request
2. Check cache
3. If present: return cached value
4. If absent: read from database
5. Put the value into cache
6. Return the value
```

Pseudo-code:

```java
public MerchantConfig getConfig(Long merchantId) {
    String key = "merchant-config:" + merchantId;

    MerchantConfig cached = cache.get(key);
    if (cached != null) {
        return cached;
    }

    MerchantConfig value = repository.findConfig(merchantId);
    cache.put(key, value, Duration.ofMinutes(10));
    return value;
}
```

The important design question is not simply "can we cache it?" but **whether stale data is acceptable** and how invalidation will work.

## TTL

A **time-to-live (TTL)** limits how long a cached entry remains valid.

Example:

```text
merchant-config:101 -> value -> TTL 10 minutes
```

TTL reduces the risk of keeping old data forever, but it does not guarantee that the cache is immediately consistent with the database.

## Cache invalidation

Suppose merchant status changes:

```text
Database update
      |
      +----> invalidate merchant-config:101
```

If invalidation is missed, the application may continue returning stale data until the entry expires.

This is why the statement **"there are only two hard things in Computer Science: cache invalidation and naming things"** reflects a real engineering problem: cache correctness can be harder than adding the cache itself.

## What should be cached?

Good candidates often have:

- High read frequency
- Relatively expensive computation or database access
- Data that tolerates some staleness
- Stable lookup keys

Be cautious with:

- Highly volatile data
- Sensitive data without a clear security model
- Very large objects
- Data where stale results can cause financial or business correctness problems

## Cache stampede

If a popular key expires and many requests arrive simultaneously, they may all query the database:

```text
              cache miss
                   |
       +-----------+-----------+
       |           |           |
       v           v           v
    Request 1   Request 2   Request 3
       |           |           |
       +-----------+-----------+
                   |
               Database
```

Mitigation strategies include request coalescing, jittered expiration, pre-warming, locking/single-flight approaches and careful TTL design.

## Distributed cache

For multiple application instances, an in-memory cache exists separately inside each JVM:

```text
             Load Balancer
              /        \
             v          v
       App Instance 1  App Instance 2
          |                |
       Local cache      Local cache
```

The instances can have different values.

A shared cache such as Redis can provide a common cache layer:

```text
             Load Balancer
              /        \
             v          v
          App 1       App 2
             \         /
              \       /
                Redis
                  |
               Database
```

This introduces additional concerns such as network latency, availability, serialization, eviction and cache consistency.

## Cache eviction

Memory is finite. Common eviction concepts include:

- LRU — least recently used
- LFU — least frequently used
- TTL-based expiration
- Maximum memory limits

The correct policy depends on the access pattern.

## Cache vs database index

Caching and indexing solve different problems.

An index helps the database find rows efficiently. A cache can avoid executing the database operation at all.

A good optimization sequence is often:

```text
Measure
  -> inspect SQL
  -> improve query/index if needed
  -> measure again
  -> introduce caching only where it solves a demonstrated workload problem
```

Caching should not be used to hide an unnecessarily slow query.

## Interview questions

### 1. What is cache-aside?
The application checks the cache first and loads the database only on a cache miss, then stores the result in the cache.

### 2. Why is TTL useful?
It bounds how long stale data can remain in the cache and prevents entries from living indefinitely.

### 3. What is a cache stampede?
Many requests simultaneously miss or expire the same popular cache entry and overload the backing database.

### 4. Local cache vs distributed cache?
A local cache is fast and isolated to one application instance. A distributed cache is shared across instances but introduces network and availability considerations.

### 5. Why not cache everything?
Caching consumes memory, creates invalidation/consistency problems and can return stale or incorrect data if used carelessly.

## Next implementation steps

- Spring Cache abstraction
- Redis with Spring Boot
- TTL configuration
- Cache eviction on updates
- Serialization choices
- Cache metrics
- Integration testing with Testcontainers
- Failure behavior when Redis is unavailable
