FROM openjdk:8
EXPOSE 8081
ADD target/jenkinstest-0.0.1-SNAPSHOT.jar jenkinstest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jenkinstest-0.0.1-SNAPSHOT.jar"]