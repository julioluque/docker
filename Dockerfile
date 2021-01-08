FROM openjdk:8u252-jdk-nanoserver
EXPOSE 8081
ADD target/docker-1.0-SNAPSHOT.jar docker-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker-1.0-SNAPSHOT.jar"]