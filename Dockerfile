#FROM eclipse-temurin:17-jdk-focal
#WORKDIR /app
#COPY target/product-0.0.1-SNAPSHOT.jar api.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "api.jar"]


#FROM eclipse-temurin:17-jdk-focal
#WORKDIR /app
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#COPY src ./src
#EXPOSE 8080
#CMD ["./mvnw", "spring-boot:run"]

FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
RUN ./mvnw clean install
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]