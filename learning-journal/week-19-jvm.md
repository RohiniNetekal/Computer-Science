# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## JVM Basics

### Short explanation
The JVM loads bytecode, manages runtime memory and executes Java code. Heap stores objects; stack holds method frames; metaspace stores class metadata.

### Handy example
```text
Java source -> javac -> bytecode -> JVM -> execution
```

### Key point
Remember: JVM is the runtime; JDK is the development kit.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Heap
- [ ] Stack
- [ ] Metaspace
- [ ] Class loading
- [ ] Bytecode
- [ ] JIT concept
- [ ] Runtime areas

## Concept in slightly more detail
The JVM loads classes, manages memory and executes bytecode. Know the purpose of major runtime areas.

## Practical example
```java
String s=new String("hello"); // object is allocated on the heap
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
