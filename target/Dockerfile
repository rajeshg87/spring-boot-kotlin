FROM openjdk:14

# Add Maintainer Info
LABEL maintainer="rajeshkannang87@gmail.com"


# Make port 8080 available to the world outside this container
EXPOSE 8080

# Add the application's jar to the container
ADD spring-boot-kotlin.jar spring-boot-kotlin.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-kotlin.jar"]
