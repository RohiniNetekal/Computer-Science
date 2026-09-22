# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## JWT Basics

### Short explanation
A JWT contains encoded claims and a signature. The server validates the token before trusting its claims.

### Handy example
```text
header.payload.signature
```

### Key point
Remember: JWT is signed, not automatically encrypted; do not put secrets in ordinary claims.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Header/payload/signature
- [ ] Claims
- [ ] Expiration
- [ ] Issuer/audience
- [ ] Signature validation
- [ ] Access vs refresh tokens
- [ ] Stateless authentication
- [ ] Do not store secrets in claims

## Concept in slightly more detail
JWT carries signed claims that the server validates before using. Signing does not mean encryption.

## Practical example
```text
header.payload.signature
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
