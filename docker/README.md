# Docker — Java Backend Containerization

A typical Spring Boot service can be packaged as a container so the same application artifact can run consistently across environments.

## Multi-stage build pattern

~~~dockerfile
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
~~~

## Why multi-stage builds?

The build image needs the JDK and Maven tooling, while the runtime image only needs what is required to run the application.

## Production checklist

- Keep images small.
- Do not bake secrets into images.
- Run as a non-root user where practical.
- Pin base image versions in controlled environments.
- Add health checks.
- Keep configuration externalized.
- Scan dependencies and container images.

This is a learning example; the Dockerfile is shown as a reference rather than a claim of production deployment.
