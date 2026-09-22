# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Spring Security Basics

### Short explanation
Authentication answers who the caller is; authorization answers what that caller can access.

### Handy example
```java
@PreAuthorize("hasRole('ADMIN')")
public void approveOffer(Long id) { }
```

### Key point
Remember: Secure endpoints at the appropriate boundary and validate permissions server-side.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
