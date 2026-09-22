# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## SOLID Principles

### Short explanation
SOLID helps keep object-oriented code maintainable: one responsibility, extensible design, substitutable types, focused interfaces and dependency inversion.

### Handy example
```java
interface NotificationSender { void send(String message); }
class EmailSender implements NotificationSender { public void send(String m) {} }
```

### Key point
Remember: DIP means high-level business logic should depend on abstractions, not concrete infrastructure.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
