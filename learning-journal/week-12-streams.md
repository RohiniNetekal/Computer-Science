# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Streams Basics

### Short explanation
Streams process collections declaratively using operations such as filter, map and collect.

### Handy example
```java
List<String> result = names.stream()
    .filter(n -> n.startsWith("A"))
    .map(String::toUpperCase)
    .toList();
```

### Key point
Remember: Intermediate operations are lazy; terminal operations trigger processing.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Creation
- [ ] filter
- [ ] map
- [ ] flatMap
- [ ] sorted
- [ ] distinct
- [ ] limit/skip
- [ ] collect/toList
- [ ] reduce
- [ ] Lazy vs terminal

## Concept in slightly more detail
Streams process data through pipelines. Know when streams improve clarity and when loops are simpler.

## Practical example
```java
List<String> active=users.stream().filter(User::isActive).map(User::getName).toList();
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
