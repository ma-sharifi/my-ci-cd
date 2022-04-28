$ ./mvnw spring-boot:run

# To build the code as a docker image, open a command-line 
# window and execute the following command for each of module:
$ mvn clean package dockerfile:build
OR
$ ./mvnw spring-boot:build-image