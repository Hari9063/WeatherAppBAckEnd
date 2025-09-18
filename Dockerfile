FROM openjdk:17-jdk-slim

# Copy JAR into container
COPY target/weatherstory-0.0.1-SNAPSHOT.jar app.jar

# Run the app
ENTRYPOINT ["java","-jar","/app.jar"]# Use Java 17 base image
