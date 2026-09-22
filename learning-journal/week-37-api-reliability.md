# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## API Reliability

### Short explanation
Network calls can time out or fail. Timeouts, controlled retries and idempotency prevent one failure from spreading.

### Handy example
```text
Request -> timeout -> limited retry -> final failure
                         |
                    idempotency key
```

### Key point
Remember: Never retry blindly; retries can multiply load during an outage.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
