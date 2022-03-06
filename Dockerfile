FROM openjdk:8
EXPOSE 8181
ADD target/mvc-starter.jar docker-mvc-starter.jar
ENTRYPOINT ["java", "jar", "/docker-spring-security.jar"]