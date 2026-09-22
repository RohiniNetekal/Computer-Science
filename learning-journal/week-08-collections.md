# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Collections Basics

### Short explanation
List preserves order and allows duplicates; Set stores unique values; Map stores key-value pairs.

### Handy example
```java
List<String> names = new ArrayList<>();
names.add("A");
Set<String> unique = new HashSet<>(names);
Map<Integer, String> users = Map.of(1, "A");
```

### Key point
Remember: Choose the collection based on access and uniqueness requirements.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
