# Use a lightweight Java runtime
#FROM openjdk:17-jdk-slim
FROM registry.access.redhat.com/ubi8/openjdk-17

# Set working directory
WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
