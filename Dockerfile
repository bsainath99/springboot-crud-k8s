FROM openjdk:latest
EXPOSE 8080
ADD target/springboot-crud-k8s.jar springboot-crud-k8s.jar
ENTRYPOINT [ "java","-jar","/springboot-crud-k8s.jar"]


