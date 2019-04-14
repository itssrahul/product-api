# Product API Application

SpringBoot Application that demonstrates REST API Development using Spring MVC, Spring Data JPA, Apache ActiveMQ using Java 8 features

## Features

This application has following REST end-points that product management. 

1. GET /product
2. POST /product/publish


## Technologies used

1. Java 8 (Programming Language)
2. Spring Boot (Application Platform)
3. Spring Data JPA (Data persistence)
4. H2 (Database)
5. Apache Active MQ
6. Flyway


## Getting Started

The source code can be checked out to your local and then build and run the application either from your IDE after importing to it as a maven project, or just from a command line. Follow these steps for the command-line option:  

### Prerequisites
1. Java 8
2. Maven 3
3. Git


### Installing & Running

####  Build using maven 
	
```
mvn clean install
```
	
#### Start the app
	
```
mvn spring-boot:run
```
		   
## API Documentation and Integration Testing 

API documentation can be accessed, once app is up locally, via [Swagger UI](http://localhost:8081/swagger-ui.html) 


## Database

This application is using H2 in-memory database, which (database as well as data) will be removed from memory when the application goes down.

## Active MQ

This application is using in-memory Active MQ

## Data pre-loading

Sample data is pre-loaded via flyway

## Basic Test Case

1. It also contains basic test case for testing persistence. 
2. More test can be added for testing API endpoints and JMS payload.

## Added Basic configuration for Docker

Dockerfile contains the configuration, which is yet to be tested.

## CI/CD Configuration

Jenkinsfile contains the proposal(draft state at present, will be completed once the Dockerization is tested successfully) to set up CI/CD for the application
