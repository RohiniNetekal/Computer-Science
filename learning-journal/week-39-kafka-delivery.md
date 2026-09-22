# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Kafka Delivery & Idempotency

### Short explanation
At-least-once processing can deliver the same event more than once. Consumers should make repeated processing safe.

### Handy example
```java
if (processedEventRepository.exists(eventId)) return;
process(event);
processedEventRepository.save(eventId);
```

### Key point
Remember: Design the business operation so duplicate messages do not create duplicate effects.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
