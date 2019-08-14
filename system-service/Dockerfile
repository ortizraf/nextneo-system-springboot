#
# Package stage
#
FROM openjdk:11
COPY /system-service-ws/target/system-service-ws-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9191
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]