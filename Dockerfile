FROM openjdk:17-slim
COPY ./build/libs/*T.jar app.jar
RUN ["java" , "-version"]
#ENV profile prod
CMD ["java","-jar","-Dspring.profiles.active=${profiles}","app.jar"]
EXPOSE 8080