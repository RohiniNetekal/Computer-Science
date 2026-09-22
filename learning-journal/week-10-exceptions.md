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


## What to cover in this topic
- [ ] Exception hierarchy
- [ ] Checked vs unchecked
- [ ] try/catch/finally
- [ ] throw vs throws
- [ ] Custom exceptions
- [ ] Multiple catch blocks
- [ ] Exception propagation
- [ ] Good error messages

## Concept in slightly more detail
Exceptions represent abnormal execution. Learn where to catch, where to propagate and how to preserve useful debugging information.

## Practical example
```java
try {
    Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println("Invalid number");
}
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced


## What to cover
- [ ] Hierarchy
- [ ] Checked/unchecked
- [ ] try/catch/finally
- [ ] throw/throws
- [ ] Custom exceptions
- [ ] Propagation
- [ ] Useful messages

## Concept in slightly more detail
Exceptions represent abnormal execution; learn where to recover and where to propagate.

## Practical example
```java
try { Integer.parseInt("abc"); } catch(NumberFormatException e) { System.out.println("Invalid"); }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
