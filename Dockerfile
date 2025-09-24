FROM openjdk:11-jdk-slim
VOLUME /tmp
COPY target/batch-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -Dserver.port=$PORT -jar /app.jar"]