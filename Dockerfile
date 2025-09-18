# Use Java 17 base image
FROM openjdk:17-jdk-slim AS build

# Copy Maven wrapper & pom.xml
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .

# ✅ Fix permission issue
RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline -B

# Copy source and build
COPY src src
RUN ./mvnw package -DskipTests

# Run stage
FROM openjdk:17-jdk-slim
COPY --from=build target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
