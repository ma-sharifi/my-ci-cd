
You can run it from Maven directly using the Spring Boot Maven plugin.
If you do this it will pick up changes that you make in the project immediately:
$ ./mvnw spring-boot:run

# To build the code as a docker image, open a command-line 
# window and execute the following command for each of module:
$ mvn clean package dockerfile:build
OR
$ ./mvnw spring-boot:build-image