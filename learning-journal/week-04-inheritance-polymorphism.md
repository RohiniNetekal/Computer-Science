# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Inheritance & Polymorphism

### Short explanation
Inheritance reuses a parent contract. Overriding lets a child provide different behavior. Polymorphism lets parent references point to child objects.

### Handy example
```java
class Payment { void pay() { System.out.println("Payment"); } }
class CardPayment extends Payment { @Override void pay() { System.out.println("Card"); } }
Payment p = new CardPayment();
p.pay();
```

### Key point
Remember: Favor composition when reuse does not represent a true is-a relationship.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover in this topic
- [ ] extends and parent/child classes
- [ ] Method overriding
- [ ] super keyword
- [ ] Runtime polymorphism
- [ ] Upcasting and downcasting
- [ ] final classes/methods
- [ ] Composition vs inheritance

## Concept in slightly more detail
Inheritance models an is-a relationship. Polymorphism lets code work with a parent type while the actual child implementation runs.

## Practical example
```java
Payment payment = new CardPayment();
payment.pay();
```

## Done checklist
- [x] Quick reference created
- [ ] All checklist points understood
- [ ] Example can be explained without looking at notes
- [ ] At least 3 interview questions practiced
