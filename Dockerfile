FROM openjdk
WORKDIR /app
COPY target//managercv-0.0.1-SNAPSHOT.jar /apyp/managercv.jar
ENTRYPOINT ["java", "-jar", "managercv.jar" ]