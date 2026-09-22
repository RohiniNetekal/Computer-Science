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
