# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## equals & hashCode

### Short explanation
equals defines logical equality; hashCode must return the same value for equal objects. Hash-based collections depend on this contract.

### Handy example
```java
record User(Long id, String name) {}
Set<User> users = new HashSet<>();
users.add(new User(1L, "A"));
users.add(new User(1L, "A"));
```

### Key point
Remember: If equals says two objects are equal, their hashCode values must match.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] equals contract
- [ ] hashCode contract
- [ ] == vs equals
- [ ] HashMap/HashSet
- [ ] Business-key equality
- [ ] Mutable keys
- [ ] Records

## Concept in slightly more detail
Hash-based collections depend on equal objects having equal hash codes. Mutable keys can break lookup.

## Practical example
```java
record User(Long id,String name) {} Set<User> users=new HashSet<>();
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
