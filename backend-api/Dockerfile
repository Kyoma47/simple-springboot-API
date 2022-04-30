FROM openjdk:11
ADD target/test-api-docker.jar test-api-docker.jar
ENTRYPOINT [ "java", "-jar", "test-api-docker.jar" ]
EXPOSE 8080