# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the Bamboo workspace to the container
COPY target/java-console-app-1.0-SNAPSHOT.jar app.jar

# Expose a port (optional, if this application was a web server, for example)
# EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "app.jar"]

