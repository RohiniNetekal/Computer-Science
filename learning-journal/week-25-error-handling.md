# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Error Handling

### Short explanation
Centralized exception handling keeps API error responses consistent and avoids duplicated try/catch blocks in controllers.

### Handy example
```java
@RestControllerAdvice
class GlobalHandler {
    @ExceptionHandler(NotFoundException.class)
    ErrorResponse handle(NotFoundException e) {
        return new ErrorResponse("NOT_FOUND", e.getMessage());
    }
}
```

### Key point
Remember: Return useful error codes/messages without exposing internal implementation details.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?


## What to cover
- [ ] Exception hierarchy
- [ ] @RestControllerAdvice
- [ ] @ExceptionHandler
- [ ] Validation errors
- [ ] HTTP status mapping
- [ ] Error response DTO
- [ ] Logging
- [ ] Do not expose internals

## Concept in slightly more detail
Centralized error handling keeps API responses consistent and controllers clean.

## Practical example
```java
@ExceptionHandler(NotFoundException.class) ErrorResponse handle(NotFoundException e){return new ErrorResponse("NOT_FOUND",e.getMessage());}
```

## Done checklist
- [x] Reference created
- [ ] All checklist points understood
- [ ] Example explained without notes
- [ ] 3 interview questions practiced
