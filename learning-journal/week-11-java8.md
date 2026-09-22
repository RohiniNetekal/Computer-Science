# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Java 8 Foundations

### Short explanation
Lambdas provide compact behavior and functional interfaces have one abstract method.

### Handy example
```java
List<String> names = List.of("A", "B");
names.forEach(name -> System.out.println(name));
```

### Key point
Remember: A lambda is an implementation of a functional interface.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Lambda syntax
- [ ] Functional interfaces
- [ ] Predicate/Function/Consumer/Supplier
- [ ] Method references
- [ ] Built-ins
- [ ] Effectively final variables
- [ ] Readability

## Concept in slightly more detail
Java 8 introduced functional programming features heavily used in backend code.

## Practical example
```java
Predicate<Integer> positive=n->n>0; System.out.println(positive.test(10));
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
