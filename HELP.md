# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

# how to build the project 

## using maven lifecycle install option

## using mvn wrapper

#### windows 

### Linux/ Mac

* go to root of project
* run `./mvnw clean` and then use `./mvnw clean install`

## using mvn directly

# how to run the project 


* run ` java -jar spring-boot-course-0.0.1-SNAPSHOT.jar`
* for different port run `java -jar spring-boot-course-0.0.1-SNAPSHOT.jar --server.port=8083`
* for different profile run `java -jar spring-boot-course-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev`