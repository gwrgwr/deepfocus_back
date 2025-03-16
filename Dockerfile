FROM maven:3.9.9 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests
FROM openjdk:17
RUN microdnf install -y git
WORKDIR /app
COPY --from=build /app/target/deepfocus-0.0.1-SNAPSHOT.jar .
EXPOSE 8080:8080
CMD ["java", "-jar", "deepfocus-0.0.1-SNAPSHOT.jar"]
