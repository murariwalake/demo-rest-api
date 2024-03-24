# Project: Building a REST API with Spring Boot

In this guide, we'll walk through the process of setting up a simple Spring Boot project to perform CRUD operations on a Student entity. We'll cover everything from creating the project using command-line tools to explaining key annotations used in the project, testing the operations with Postman, and more.

## Prerequisites:
Before diving into Spring Boot, it’s important to have a basic understanding of Java programming and RESTful architecture concepts. Additionally, ensure you have the following tools installed:

1. Java Development Kit (JDK) Java 17
2. Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse
3. Postman or a similar API testing tool

## 1. Creating the Spring Boot Project:

- Navigate to [start.spring.io](https://start.spring.io/) or click on this [link](https://start.spring.io/) which has pre-selected configurations.
- Download and unzip the file into your desired directory.
- Open the project directory in your IDE (e.g., IntelliJ IDEA) by selecting `pom.xml` and opening it with your IDE.

## 2. Understanding `@SpringBootApplication`:

The `@SpringBootApplication` annotation is a meta-annotation that combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`. It marks the main class of a Spring Boot application, enabling auto-configuration and component scanning.

## 3. Adding the Student Class:

Create a `Student` class in the package `com.murariwalake.demorestapi.model` with attributes such as `id`, `name`, `age`, etc.

```java
package com.murariwalake.demorestapi.model;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor, getters, and setters
}
```

## 4. Creating the Controller Class:

Create a controller class `StudentRestController.java` to handle CRUD operations for the `Student` entity. Annotate this class with `@RestController` to indicate that it will handle RESTful requests.

```java
package com.murariwalake.demorestapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/students")
public class StudentRestController {

    // Controller methods for CRUD operations
}
```

## Annotations Used in Controller Class:

- `@RestController`: Indicates that the class defines a REST controller.
- `@RequestMapping`: Maps HTTP requests to handler methods.
- `@GetMapping`: Maps HTTP GET requests onto specific handler methods.
- `@PostMapping`: Maps HTTP POST requests onto specific handler methods.
- `@PutMapping`: Maps HTTP PUT requests onto specific handler methods.
- `@DeleteMapping`: Maps HTTP DELETE requests onto specific handler methods.
- `@RequestBody`: Binds the HTTP request body to a method parameter.
- `@PathVariable`: Variable that passed in URL. Ex: `api/students/{id}` in this API `id` is the path variable.

## 5. Running the Application:

You can run the Spring Boot application in IntelliJ IDEA by right-clicking on the main class (`DemoRestApiApplication`) and selecting “Run”.

By default, the application starts on port 8080.

Alternatively, you can run it from the command line using Maven:

```bash
mvn spring-boot:run
```

## 6. Testing with Postman:

After starting the application, open Postman and import the provided JSON file to start testing each API endpoint.

[Postman JSON file](https://github.com/murariwalake/demo-rest-api/blob/main/postman-collection.json) (JSON file not provided in the original content)

## Conclusion:

In this guide, we’ve covered the basics of building simple REST APIs with Spring Boot. By leveraging annotations like `@RestController` and `@RequestMapping`, along with component scanning, we’ve created a CRUD application for managing student records. Spring Boot’s ease of use and powerful features make it an excellent choice for developing RESTful services.

Happy coding with Spring Boot!

**Thanks for reading!** 🙏🏻# demo-rest-api
