# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Generics

### Short explanation
Generics provide compile-time type safety and avoid unnecessary casts.

### Handy example
```java
List<String> names = new ArrayList<>();
names.add("Rohini");
String first = names.get(0);
```

### Key point
Remember: List<String> is safer than a raw List.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover in this topic
- [ ] Generic classes
- [ ] Generic methods
- [ ] Type safety
- [ ] Diamond operator
- [ ] Bounded types
- [ ] ? extends and ? super
- [ ] Type erasure

## Concept in slightly more detail
Generics let the compiler enforce data types. Wildcards are important when designing reusable APIs.

## Practical example
```java
List<String> names = new ArrayList<>();
names.add("Rohini");
String name = names.get(0);
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced


## What to cover
- [ ] Generic classes
- [ ] Generic methods
- [ ] Type safety
- [ ] Diamond operator
- [ ] Bounds
- [ ] extends/super
- [ ] Type erasure

## Concept in slightly more detail
Generics provide compile-time type safety and reusable APIs.

## Practical example
```java
List<String> names=new ArrayList<>(); names.add("Rohini"); String n=names.get(0);
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
