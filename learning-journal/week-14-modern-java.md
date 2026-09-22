# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Records & Modern Java

### Short explanation
Records are concise data carriers. Modern Java also provides features such as switch expressions and text blocks.

### Handy example
```java
record MerchantDto(Long id, String name) {}
var dto = new MerchantDto(1L, "ABC");
```

### Key point
Remember: Use language features that improve clarity and match your project's supported Java version.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Records
- [ ] Record accessors
- [ ] Switch expressions
- [ ] Text blocks
- [ ] var
- [ ] Pattern matching
- [ ] Version compatibility

## Concept in slightly more detail
Modern Java reduces boilerplate; use features supported by the project's Java version.

## Practical example
```java
record MerchantDto(Long id,String name) {}
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
