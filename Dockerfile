FROM openjdk:17-oracle
COPY target/recordkeeping-0.0.1-SNAPSHOT.jar recordkeeping.jar
ENTRYPOINT ["java", "-jar", "/recordkeeping.jar"]