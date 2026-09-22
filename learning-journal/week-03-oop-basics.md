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
