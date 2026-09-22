# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Strings

### Short explanation
String is immutable: operations create new String values. StringBuilder is useful for repeated modifications.

### Handy example
```java
String name = "Rohini";
String result = name.toUpperCase();
StringBuilder sb = new StringBuilder("Pay");
sb.append("ment");
```

### Key point
Remember: String immutability makes String safe to share but repeated concatenation can create objects.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
