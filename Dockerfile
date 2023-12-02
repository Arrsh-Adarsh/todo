FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.war todo-list.war
ENTRYPOINT ["java","-jar","/todo-list.war"]
EXPOSE 8080
