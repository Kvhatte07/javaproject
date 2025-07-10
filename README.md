# Employee Management System

Java Maven PostgreSQL JDBC

The Employee Management System is a console-based application built using Core Java, JDBC, and PostgreSQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on employee records stored in a PostgreSQL database. The application is menu-driven, providing a simple and intuitive interface for managing employee data.

## Features
- **Add Employee:** Add a new employee record to the database.
- **View All Employees:** Fetch and display all employee records.
- **Update Employee:** Update an existing employee's details (e.g., name, age, department, salary).
- **Delete Employee:** Delete an employee record by ID.
- **Menu-Driven Interface:** Easy-to-use console-based menu for seamless navigation.
- **Uses Collections:** Retrieves and displays employee list using Java Collections.

## Technologies Used
- **Core Java:** For implementing the application logic and OOP concepts.
- **JDBC:** For connecting to and interacting with the PostgreSQL database.
- **PostgreSQL:** For storing and managing employee data.
- **Maven:** For project dependency management and building the project.

## Dependencies
The project uses the following dependency:

```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
</dependency>
```

## Prerequisites
Before running the project, ensure you have the following installed:

- Java Development Kit (JDK) 17 
- Apache Maven 3.8.6 
- PostgreSQL 15 

## PostgreSQL Setup

1. Create a database named `kvbd`:
   ```sql
   CREATE DATABASE kvbd;
   ```

2. Create the following table:
   ```sql
   CREATE TABLE employees (
       id SERIAL PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       age INT NOT NULL,
       department VARCHAR(100) NOT NULL,
       salary DECIMAL(10, 2) NOT NULL
   );

   ![screenshot](https://github.com/Kvhatte07/javaproject/blob/main/WhatsApp%20Image%202025-07-10%20at%203.49.39%20PM.jpeg?raw=true)


Enjoy using the Employee Management System!
