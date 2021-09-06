FROM amazoncorretto:11
ARG JAR_FILE=target/my-cloud-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]