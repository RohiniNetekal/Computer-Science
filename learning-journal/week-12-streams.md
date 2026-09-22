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
