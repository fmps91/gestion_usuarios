
#FROM openjdk:8-jdk-alpine as gestion_usuarios
#WORKDIR /app
#EXPOSE 90/tcp
#COPY /Users/f/proyecto-SBC/backend/gestion_usuarios/springboot2-postgresql-jpa-hibernate-crud-example/target/springboot2-postgresql-jpa-hibernate-crud-example-0.0.1-SNAPSHOT.jar /app/
#RUN java -jar springboot2-postgresql-jpa-hibernate-crud-example-0.0.1-SNAPSHOT.jar
#ARG  puerto=latest
FROM openjdk:8-alpine
COPY /springboot2-postgresql-jpa-hibernate-crud-example/target/*.jar app.jar
#EXPOSE 8090
ENTRYPOINT ["java","-jar","app.jar"]
