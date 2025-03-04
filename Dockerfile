FROM eclipse-temurin:11-jre-alpine
LABEL maintainer="Thiago Santana"

WORKDIR /app

COPY target/javalin-app.jar app.jar
EXPOSE 7070 

CMD ["java", "-jar", "app.jar"]