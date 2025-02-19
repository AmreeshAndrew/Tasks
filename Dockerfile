FROM eclipse-temurin:17
COPY target/tasks.jar tasks.jar 
CMD ["java","-jar","tasks.jar"]
