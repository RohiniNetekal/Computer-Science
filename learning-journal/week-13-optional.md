# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Optional

### Short explanation
Optional represents a value that may be absent and can make absence explicit.

### Handy example
```java
Optional<String> name = Optional.ofNullable(findName());
String value = name.orElse("Unknown");
```

### Key point
Remember: Optional is most useful for return values; do not use it everywhere as a replacement for fields.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] of/ofNullable/empty
- [ ] map/filter
- [ ] orElse/orElseGet
- [ ] orElseThrow
- [ ] Avoid get()
- [ ] Return values
- [ ] When not to use

## Concept in slightly more detail
Optional makes absence explicit, especially in return values.

## Practical example
```java
String name=Optional.ofNullable(findName()).orElse("Unknown");
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
