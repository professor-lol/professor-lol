FROM openjdk:8-jdk-alpine
ADD ./professorlol-web/build/libs/professorlol-web-0.0.1-SNAPSHOT.jar professorlol-web-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/professorlol-web-0.0.1-SNAPSHOT.jar "]