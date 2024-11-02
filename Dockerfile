# Use Maven to build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests  # Build the JAR

# Use a lightweight JRE to run the application
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/Spring-Boot-Todo-Application-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]