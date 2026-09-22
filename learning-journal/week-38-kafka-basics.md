# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Kafka Basics

### Short explanation
Kafka stores events in topics divided into partitions. Consumers track offsets and consumer groups distribute partitions.

### Handy example
```text
Producer -> Topic -> Partition 0 -> Consumer A
                 -> Partition 1 -> Consumer B
```

### Key point
Remember: Ordering is guaranteed within a partition, not across all partitions.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Producer
- [ ] Consumer
- [ ] Topic
- [ ] Partition
- [ ] Offset
- [ ] Consumer group
- [ ] Keys
- [ ] Ordering
- [ ] Retention
- [ ] Rebalancing concept

## Concept in slightly more detail
Kafka is a distributed event streaming platform. Partitions provide scalability and ordering within each partition.

## Practical example
```text
Producer -> Topic -> Partition 0 -> Consumer A
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
