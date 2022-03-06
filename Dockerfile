FROM openjdk:8
EXPOSE 8181
ADD target/mvc-starter.war docker-mvc-starter.war
ENTRYPOINT ["java", "jar", "/docker-mvc-starter.war"]