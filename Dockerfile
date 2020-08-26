FROM openjdk:14-alpine
COPY build/libs/mn-okta-example-*-all.jar mn-okta-example.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "mn-okta-example.jar"]