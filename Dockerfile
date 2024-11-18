
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/hello_world_2-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 4041
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
