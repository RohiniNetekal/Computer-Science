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


## What to cover
- [ ] Authentication
- [ ] Authorization
- [ ] Security filter chain
- [ ] Password encoding
- [ ] Roles/authorities
- [ ] Method security
- [ ] CSRF concept
- [ ] CORS concept

## Concept in slightly more detail
Authentication identifies the caller; authorization checks permissions. Security must be enforced server-side.

## Practical example
```text
@PreAuthorize("hasRole('ADMIN')") public void approveOffer(Long id) {}
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
