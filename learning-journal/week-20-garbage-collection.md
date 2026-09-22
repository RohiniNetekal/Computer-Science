# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Garbage Collection

### Short explanation
GC identifies objects that are no longer reachable and reclaims their memory. Application code should avoid unnecessary object retention.

### Handy example
```java
List<byte[]> cache = new ArrayList<>();
// An unbounded cache can retain objects and increase memory pressure.
```

### Key point
Remember: A memory leak in Java usually means unwanted references keep objects reachable.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
