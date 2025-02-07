# Book-Library
NOT YET COMPLETE (working on frontend and adding security)

This is a Spring Boot application that provides a RESTful API for managing a library. Users can perform CRUD (Create, Read, Update, Delete) operations on books, ensuring efficient book management.

Features:
- Retrieve a list of all books: On the frontend, you can use a GET request to the /api/books endpoint to fetch and display a list of all books.
- Retrieve details of a specific book: To get detailed information about a particular book, the frontend can send a GET request to /api/books/{id} using the book's ID, and   then display the specific book's details.
- Add a new book: When adding a new book, the frontend can use a POST request to /api/books with the book details in the request body to create a new entry in the system.
- Update an existing book: The frontend can send a PUT request to /api/books/{id} with the updated book information in the request body to modify an existing book's details.
- Delete a book: To remove a book, the frontend can make a DELETE request to /api/books/{id} with the specific book's ID, and the backend will delete it from the system
- All these changes are reflected in the MySQL database

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
   







