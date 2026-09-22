# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Spring MVC

### Short explanation
Spring MVC maps HTTP requests to controller methods and converts JSON to/from Java objects.

### Handy example
```java
@RestController
@RequestMapping("/orders")
class OrderController {
    @GetMapping("/{id}")
    OrderDto get(@PathVariable Long id) { return service.find(id); }
}
```

### Key point
Remember: Keep controllers thin; business rules belong in services.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
