FROM openjdk:17

WORKDIR /app

COPY target/spotify-api-0.0.1-SNAPSHOT.jar /app/app.jar

ENV CLIENT_ID=your-client-id
ENV CLIENT_SECRET=your-client-secret

CMD ["java", "-jar", "app.jar"]