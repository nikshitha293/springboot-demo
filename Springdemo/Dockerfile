# Use the official OpenJDK 21 base image
FROM openjdk:21

# Set the working directory
WORKDIR /app

# Copy the jar file from target folder into the container
COPY target/springdemo-0.0.1-SNAPSHOT.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
