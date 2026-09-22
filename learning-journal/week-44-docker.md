# One-Page Concept Reference

**Status:** ✅ Done — reference example created

## Docker Basics

### Short explanation
Docker packages an application and its runtime dependencies into a container image.

### Handy example
```dockerfile
FROM eclipse-temurin:21-jre
COPY app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

### Key point
Remember: Keep images small and configuration outside the image when possible.

### Interview check
- What is it?
- Why would you use it?
- What is one common mistake or trade-off?
