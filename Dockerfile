FROM amazoncorretto:21-alpine-jdk as build
WORKDIR /app
COPY . .
RUN ./mvnw install
RUN ls -lh

FROM amazoncorretto:21-alpine as run
COPY --from=build /app/target/pet-store-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "/app/pet-store-0.0.1-SNAPSHOT.jar"]
