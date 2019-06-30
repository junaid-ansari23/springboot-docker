# springboot-docker
A simple boot application that runs on docker.Docker file is added.Its a maven based build. Hit the url http://localhost:8080/ to check the application status.A rest controller is mapped to this.
Steps to build & run the application-
1. build the application
maven clean package
2. Docker build
docker build -f Dockerfile -t spring-docker:v1 .
3. Run application on port 8080
docker run --rm -p 8080:8080 spring-docker:v1
4. verify application
hit http://localhost:8080/

