# Book-Library
NOT YET COMPLETE (working on frontend and adding security)

This is a Spring Boot application that provides a RESTful API for managing a library. Users can perform CRUD (Create, Read, Update, Delete) operations on books, ensuring efficient book management.

PageController (Frontend Interaction & CRUD Operations):
-The PageController is responsible for managing the web pages that users interact with and handles CRUD operations directly via the frontend. It facilitates viewing, searching, creating, and updating books through a user interface.
- View All Books: When users visit the /books page, the PageController retrieves a list of all books in the library via the libraryService.findAll() method and displays them on the page using the index view in table format.
- Search for a Book: If a user wants to search for a book by its ID, they can visit the /books/search endpoint. If the book is found, its details are displayed; otherwise, an error message is shown (e.g., "Book not found at ID: X").
- Create a New Book: Users can navigate to the /books/update page and submit a form to create a new book. The book details (title, author, and publication year) are sent via a POST request to the same /update endpoint. The create() method creates the new book and displays the result on the update page.
- Update an Existing Book: If users want to update a book, they can submit a form with the updated information (title, author, publication year). A PUT request is sent to the /books/update endpoint to update the book in the system. If the book with the provided ID is found, it gets updated, and the changes are reflected on the update page.

LibraryController (API Interaction):

- The LibraryController provides RESTful API endpoints that allow external systems or frontend JavaScript to interact with the library's data. It follows the principles of CRUD operations using HTTP methods like GET, POST, PUT, and DELETE to manipulate book data.
- Retrieve All Books: The GET /api/books endpoint retrieves a list of all books in the library, returning them in JSON format.
- Retrieve a Specific Book: The GET /api/books/{id} endpoint retrieves the details of a book based on the provided ID. If the book exists, its details are returned as a JSON object.
- Create a New Book: The POST /api/books endpoint allows users to create a new book by sending the book data (title, author, and publication year) in the request body as a JSON object. Upon successful creation, the new book is added to the library.
- Update an Existing Book: The PUT /api/books/{id} endpoint updates an existing book's details. The updated book data is sent in the request body, and the book identified by the provided ID is updated accordingly.
- Delete a Book: The DELETE /api/books/{id} endpoint allows users to delete a specific book by providing its ID. After the book is deleted, the backend responds with a 204 No Content status.

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
   







