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


## What to cover in this topic
- [ ] Collection hierarchy
- [ ] List vs Set vs Map
- [ ] ArrayList
- [ ] LinkedList concept
- [ ] HashSet
- [ ] HashMap
- [ ] TreeSet/TreeMap basics
- [ ] Iterator and for-each
- [ ] Choosing a collection

## Concept in slightly more detail
Collections solve common storage problems. Know ordering, duplicates, lookup behavior and typical complexity for major implementations.

## Practical example
```java
List<String> list = new ArrayList<>();
Set<String> unique = new HashSet<>();
Map<Long,String> users = new HashMap<>();
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced


## What to cover
- [ ] Hierarchy
- [ ] List/Set/Map
- [ ] ArrayList
- [ ] LinkedList
- [ ] HashSet
- [ ] HashMap
- [ ] TreeSet/TreeMap
- [ ] Iterator
- [ ] Choosing collections

## Concept in slightly more detail
Collections solve storage and lookup problems. Know ordering, duplicates and typical complexity.

## Practical example
```java
List<String> l=new ArrayList<>(); Set<String> s=new HashSet<>(); Map<Long,String> m=new HashMap<>();
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
