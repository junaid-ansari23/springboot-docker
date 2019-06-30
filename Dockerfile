FROM openjdk:alpine
MAINTAINER Junaid Ansari <junaid.ans@gmail.com>
ADD target/spring-docker.jar spring-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-docker.jar"]
EXPOSE 8080