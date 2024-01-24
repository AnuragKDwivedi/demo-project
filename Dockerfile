#Run Spring boot application in a container
FROM openjdk:latest
ARG JAR_FILE=target/*.jar
COPY ./target/custom-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9080
ENTRYPOINT ["java", "-jar", "/app.jar"]
