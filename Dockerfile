# Use OpenJDK 17 slim image
FROM openjdk:17-slim

# Create app directory
WORKDIR /app

# Copy the built JAR file from Maven build
COPY target/hello-docker-java-1.0.0.jar /app/app.jar

# Run the JAR
CMD ["java", "-jar", "app.jar"]
