FROM amazoncorretto:17-alpine-jdk
COPY target/Excel-Processor-App-0.0.1-SNAPSHOT.jar Excel-Processor-App-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Excel-Processor-App-0.0.1-SNAPSHOT.jar"]