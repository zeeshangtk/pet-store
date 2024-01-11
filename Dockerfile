FROM amazoncorretto:21-alpine-jdk as build
WORKDIR /app
COPY . .

FROM build as package
ARG DB_URL
ENV DB_URL=$DB_URL
ARG DB_USER_NAME
ENV DB_USER_NAME=$DB_USER_NAME
ARG DB_PASSWORD
ENV DB_PASSWORD=$DB_PASSWORD
RUN ./mvnw install


FROM amazoncorretto:21-alpine as run
COPY --from=package /app/target/pet-store-*.jar /app/pet-store.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/pet-store.jar"]
