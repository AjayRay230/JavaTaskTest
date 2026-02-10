# ---------- BUILD STAGE ----------
FROM eclipse-temurin:17-jdk-alpine AS build

WORKDIR /app

COPY mvnw mvnw
COPY .mvn .mvn
COPY pom.xml pom.xml

# FIX: make mvnw executable
RUN chmod +x mvnw

# Cache dependencies
RUN ./mvnw dependency:go-offline

COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests


# ---------- RUNTIME STAGE ----------
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
