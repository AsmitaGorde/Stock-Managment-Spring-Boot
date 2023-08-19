# Stock-Managment-Spring-Boot
## Framework: Spring Boot
## Template Engine: Thymeleaf
## Components:

## HomeController:

Responsible for handling requests related to the home page.
Renders the main landing page.
Uses Thymeleaf to display dynamic content.
## Book Class:

Represents a book entity.
Contains attributes like title, author, genre, etc.
## Laptop Class:

Represents a laptop entity.
Contains attributes like brand, model, specifications, etc.
## Stock Class:

Represents an item's stock information.
Includes attributes like item name, purchase,sell cost and Margin.
Provides getters and setters for these attributes.
## Thymeleaf Templates:

Utilizes Thymeleaf syntax for dynamic HTML rendering.
Interpolates data from the Spring model into HTML templates.
Enables conditionals, loops, and dynamic attribute binding.
## Spring Boot Dependencies:

## spring-boot-starter-web:

Provides web-related functionalities.
Handles HTTP requests and responses.
Includes embedded Tomcat server for deployment.
## spring-boot-starter-thymeleaf:

Integrates Thymeleaf as the template engine.
Enables dynamic content rendering in HTML.
## spring-boot-starter-data-jpa:

Simplifies database interaction using Java Persistence API (JPA).
Provides repositories for data access.
Supports Object-Relational Mapping (ORM) with entities.
## spring-boot-starter-test:

Includes testing frameworks for unit and integration testing.
Facilitates writing and executing test cases.
## Configuration:

Spring Automatic Configuration:
Spring Boot's auto-configuration simplifies setup.
Automatically configures common components based on dependencies.
Reduces the need for extensive manual configuration.
