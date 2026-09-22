# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Methods & Clean Code

### Short explanation
A method groups one responsibility and can receive parameters and return a value. Method overloading uses the same name with different parameters.

### Handy example
```java
static double calculateTotal(double price, int qty) {
    return price * qty;
}
```

### Key point
Remember: Prefer small methods with clear names and one responsibility.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover in this topic
- [ ] Method declaration and invocation
- [ ] Parameters and return values
- [ ] Pass-by-value in Java
- [ ] Method overloading
- [ ] Local variable scope
- [ ] Naming and single responsibility
- [ ] Avoiding duplicated logic

## Concept in slightly more detail
A method packages one small piece of behavior. Good methods are easy to name, test and reuse.

## Practical example
```java
static double total(double price, int quantity) {
    return price * quantity;
}
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced


## What to cover
- [ ] Declaration and invocation
- [ ] Parameters/returns
- [ ] Pass-by-value
- [ ] Overloading
- [ ] Scope
- [ ] Naming
- [ ] Single responsibility

## Concept in slightly more detail
Methods package reusable behavior and should stay focused.

## Practical example
```java
static double total(double p,int q){ return p*q; }
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
