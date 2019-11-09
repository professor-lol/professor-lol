FROM openjdk:8-jdk-alpine
ADD ./professorlol-web/build/libs/*.jar professorlol.jar
ENTRYPOINT ["java", "-jar", "/professorlol.jar"]