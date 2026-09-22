# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Exceptions

### Short explanation
Exceptions represent abnormal conditions. Checked exceptions are enforced by the compiler; unchecked exceptions usually represent programming or validation failures.

### Handy example
```java
try {
    int value = Integer.parseInt("10");
} catch (NumberFormatException e) {
    System.out.println("Invalid number");
}
```

### Key point
Remember: Handle an exception where you can recover; otherwise propagate it meaningfully.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
