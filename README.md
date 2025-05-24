# Spring Boot CRUD Application (MVC) with H2 File-Based Database

This is a Spring Boot application that follows the **MVC (Model-View-Controller)** pattern and performs **basic CRUD operations** using a **file-based H2 database**.

---

## Features

- Spring Boot MVC architecture
- RESTful CRUD APIs
- H2 file-based database
- Spring Data JPA for database interaction
- Spring Web for handling HTTP requests
- Built with Maven

---

## Dependencies Used

The project uses the following Spring Boot dependencies:

- `spring-boot-starter-web`
- `spring-boot-starter-data-jpa`
- `com.h2database:h2`

---

## H2 File-Based Database Configuration

In `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:file:./data/demo
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
