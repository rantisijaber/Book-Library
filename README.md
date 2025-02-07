# Book-Library
NOT YET COMPLETE (working on frontend and adding security)

This is a Spring Boot application that provides a RESTful API for managing a library. Users can perform CRUD (Create, Read, Update, Delete) operations on books, ensuring efficient book management.

Features:
- Retrieve a list of all books (GET /api/books)
- Retrieve details of a specific book (GET /api/books/{id})
- Add a new book (POST /api/books)
- Update an existing book (PUT /api/books/{id})
- Delete a book (DELETE /api/books/{id})

Tech Stack:
- Java
- Spring Boot (Spring Web, Spring Data JPA)
- Hibernate (via Spring Data JPA)
- MySQL
- Maven
- Thymeleaf

I am currently working on:
- Adding meaningful comments throughout the code to improve clarity and explain functionality.
- Building a frontend using Thymeleaf for dynamic, server-rendered web pages
- Integrating Spring Security for authentication and role-based access control
  

Setup: 
1. Clone the repository
2. Configure your application.properties (e.g., database connection)
3. Build and run the application:
   







