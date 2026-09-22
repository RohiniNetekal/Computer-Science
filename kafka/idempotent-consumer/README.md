# Kafka — Idempotent Consumer Pattern

Kafka consumers can receive a message more than once. Business processing should therefore be designed so duplicate delivery does not create duplicate side effects.

## Example flow

~~~text
Kafka message
     |
     v
Validate event
     |
     v
Check eventId in processed_event
     |
  +--+--+
  |     |
seen   new
  |     |
skip   process business transaction
        |
        v
   record eventId
~~~

## Key design points

- Give every business event a stable eventId.
- Make the database operation idempotent using a unique constraint where appropriate.
- Commit business state and processed-event state consistently.
- Configure retries and dead-letter handling deliberately.
- Preserve correlation IDs for tracing.
- Monitor consumer lag and processing failures.

Kafka delivery semantics do not automatically make a business operation idempotent. The application still needs a duplicate-handling strategy.

This is conceptual learning material, not a claim of production Kafka implementation.
