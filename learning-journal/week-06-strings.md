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


## What to cover in this topic
- [ ] String immutability
- [ ] String pool
- [ ] == vs equals()
- [ ] StringBuilder/StringBuffer
- [ ] Common String methods
- [ ] Concatenation performance
- [ ] Formatting and parsing

## Concept in slightly more detail
String is immutable, so operations produce new values. Understand equality and the string pool because these are frequent interview topics.

## Practical example
```java
String a = "Java";
String b = new String("Java");
System.out.println(a.equals(b));
System.out.println(a == b);
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced
