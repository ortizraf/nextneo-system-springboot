FROM openjdk:11
ARG APP_VERSION

RUN echo ${APP_VERSION}

COPY system-service/system-service-ws/target/system-service-ws-${APP_VERSION}.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","app.jar"]