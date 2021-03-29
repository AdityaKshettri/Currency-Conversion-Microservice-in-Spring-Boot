# Currency-Conversion-Microservice-in-Spring-Boot
In this project, I have worked on a currency conversion application using various microservices in Spring Boot and deployed it in Docker.

# Links:

Eureka Server : http://localhost:8761/

Currency-Exchange Microservice : http://localhost:8000/from/USD/to/INR

Currency-Conversion Microservice : http://localhost:8100/from/USD/to/INR/quantity/10

Currency-Exchange Microservice via API-Gateway : http://localhost:8765/currency-exchange/from/USD/to/INR

Currency-Conversion Microservice via API-Gateway : http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10

Zipkin Server : http://localhost:9411/zipkin/

# Docker Images:

Naming-Server : adityakshettri/naming-server:0.0.1-SNAPSHOT

Currency-Exchange Service : adityakshettri/currency-exchange-service:0.0.1-SNAPSHOT

Currency-Conversion Service : adityakshettri/currency-conversion-service:0.0.1-SNAPSHOT

Api-Gateway : adityakshettri/api-gateway:0.0.1-SNAPSHOT
