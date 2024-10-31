FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/Spring-Boot-Todo-Application-0.0.1-SNAPSHOT.jar /app/Spring-Boot-Todo-Application-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/Spring-Boot-Todo-Application-0.0.1-SNAPSHOT.jar"]