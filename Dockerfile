FROM java:8
EXPOSE 8080
ADD /target/SpringBootWithDockerDemo.jar   SpringBootWithDockerDemo.jar
ENTRYPOINT ["java" "-jar","SpringBootWithDockerDemo.jar"]
