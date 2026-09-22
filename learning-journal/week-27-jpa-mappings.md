# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## JPA Mappings

### Short explanation
Relationships map object associations to foreign keys. The owning side controls the relationship mapping.

### Handy example
```java
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "merchant_id")
private Merchant merchant;
```

### Key point
Remember: Know which side owns the relationship before changing mappings.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] One-to-one
- [ ] One-to-many
- [ ] Many-to-one
- [ ] Many-to-many
- [ ] Owning side
- [ ] mappedBy
- [ ] JoinColumn
- [ ] Cascade basics

## Concept in slightly more detail
JPA mappings connect object relationships to foreign keys. Understand the owning side before changing mappings.

## Practical example
```java
@ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="merchant_id") private Merchant merchant;
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
