# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Arrays & Complexity

### Short explanation
An array stores a fixed-size sequence. Big-O describes how work grows with input size.

### Handy example
```java
int[] ids = {10, 20, 30};
for (int id : ids) {
    System.out.println(id);
}
```

### Key point
Remember: Direct array access is O(1); scanning an array is O(n).

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover in this topic
- [ ] Array declaration and initialization
- [ ] Indexing and traversal
- [ ] Multidimensional arrays
- [ ] Searching and sorting basics
- [ ] Fixed size
- [ ] Big-O notation
- [ ] Time vs space complexity

## Concept in slightly more detail
Arrays provide fixed-size indexed storage. Learn to estimate the cost of loops and nested loops using Big-O.

## Practical example
```java
int[] ids = {10, 20, 30};
for (int id : ids) System.out.println(id);
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced
