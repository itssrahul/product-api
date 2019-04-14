# Product API Application

SpringBoot Application that demonstrates REST API Development using Spring MVC, Spring Data JPA, Apache ActiveMQ using Java 8 features

## Features

This application has following REST end-points that product management. 

1. GET /product
2. POST /product/publish
    
#####  Basic Validations
a. Max Length allowed for Product ID and Model no. is 6
b. Product Metadata, Pricing, Product Description is mandatory in the payload

##### Sample Json Payload

```
{
  "id": "CW7088",
  "name": "Nite Jogger Shoes",
  "model_number": "ATO93",
  "product_type": "inline",
  "meta_data": {
    "page_title": "adidas Nite Jogger Shoes - Black | adidas UK",
    "site_name": "adidas United Kingdom",
    "description": "Shop for Nite Jogger Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.",
    "keywords": "Nite Jogger Shoes",
    "canonical": "//www.adidas.co.uk/nite-jogger-shoes/CG7088.html"
  },
  "pricing_information": {
    "standard_price": 119.95,
    "standard_price_no_vat": 99.96,
    "currentPrice": 119.95
  },
  "product_description": {
    "title": "Nite Jogger Shoes",
    "subtitle": "Modern cushioning updates this flashy '80s standout.",
    "text": "Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort."
  }
} 

```


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
