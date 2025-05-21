#
# Build stage
#
FROM gradle:jdk21-jammy AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

LABEL org.name="AissaniOussama"
#
# Package stage
#
FROM eclipse-temurin:21-jdk-jammy
COPY --from=build C:/Users/aissa/Desktop/Studium/WebTechRepo/webtech.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]