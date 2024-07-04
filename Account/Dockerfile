# for running java application image we need jdk
FROM openjdk:17-jdk-slim

#Adding the application jar to the image
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

#Information around who maintain the image
MAINTAINER CodeWithAamir
# ENTRYPOINT=  When any one trying to generate a container from my docker image so please execute so on so commands
# Same like java -jar <jar>
ENTRYPOINT ["java","-jar","/app.jar"]