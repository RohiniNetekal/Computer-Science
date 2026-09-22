# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## OOP Basics

### Short explanation
A class defines state and behavior; an object is an instance. Encapsulation keeps internal state controlled through methods.

### Handy example
```java
class Merchant {
    private String name;
    public Merchant(String name) { this.name = name; }
    public String getName() { return name; }
}
```

### Key point
Remember: Encapsulation = hide implementation details and expose a safe API.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover in this topic
- [ ] Class vs object
- [ ] Fields and methods
- [ ] Constructors
- [ ] this keyword
- [ ] Access modifiers
- [ ] Encapsulation
- [ ] Getters/setters and controlled mutation

## Concept in slightly more detail
OOP models business objects using state and behavior. Encapsulation protects state from uncontrolled changes.

## Practical example
```java
class Merchant {
    private final String name;
    Merchant(String name) { this.name = name; }
    String getName() { return name; }
}
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced


## What to cover
- [ ] Class/object
- [ ] Fields/methods
- [ ] Constructors
- [ ] this
- [ ] Access modifiers
- [ ] Encapsulation
- [ ] Controlled mutation

## Concept in slightly more detail
OOP models state and behavior while encapsulation protects internal state.

## Practical example
```java
class Merchant { private final String name; Merchant(String n){name=n;} String getName(){return name;} }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
