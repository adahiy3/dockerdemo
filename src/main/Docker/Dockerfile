# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="mail2dahiya@gmail.com"

# Add a volume pointing to /tmp


# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
WORKDIR build/libs/dockerdemo-0.0.1-SNAPSHOT.jar

#ARG JAR_FILE=build/libs/
ARG JAR_FILE=${WORKDIR}

# Add the application's jar to the container
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]