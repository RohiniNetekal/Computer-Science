# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Hibernate Basics

### Short explanation
Hibernate maps Java objects to relational tables and manages entity state inside a persistence context.

### Handy example
```java
@Entity
class Merchant {
    @Id
    private Long id;
    private String name;
}
```

### Key point
Remember: Understand transient, managed and detached entity states.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Entity lifecycle
- [ ] Persistence context
- [ ] Session/EntityManager
- [ ] Transient/managed/detached
- [ ] Dirty checking
- [ ] flush
- [ ] First-level cache

## Concept in slightly more detail
Hibernate maps objects to relational data and tracks entity state inside a persistence context.

## Practical example
```java
@Entity class Merchant { @Id Long id; String name; }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
