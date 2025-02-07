package com.rantisi.library.service;

import com.rantisi.library.exceptions.BookNotFoundException;
import com.rantisi.library.model.Book;
import com.rantisi.library.repository.LibraryRepo;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

// Creates the methods and business logic that will be used in the controller layer
@Service
public class LibraryService {

    // Autowiring / Dependency Injection (Constructor injection)
    private final LibraryRepo libraryRepo;


    public LibraryService(LibraryRepo libraryRepo) {
        this.libraryRepo = libraryRepo;
    }

    // Finds all the books in the database
    public List<Book> findAll() {
        return libraryRepo.findAll();
    }

    // Finds book by ID
    public Book findById(Integer id, boolean isAPI) {
        Optional<Book> book = libraryRepo.findById(id);
        if (isAPI && book.isEmpty()) {
            throw new BookNotFoundException();
        } else {
            return book.orElse(null);
        }
    }

    // Creates a new book, saves it to the database, and can be accessed via the API
    public Book create(Book book) {
        libraryRepo.save(book);
        return book;
    }
    // Updates the book, saves new information to the database, can be accessed via API
    public Book update(Book book, Integer id) {
        if (!libraryRepo.existsById(id)) {
            throw new BookNotFoundException();
        }
        book.setId(id);
        libraryRepo.save(book);
        return book;
    }

    // Deletes the book, removes it from the database, can be accessed via API
    public void delete(Integer id) {
        if (!libraryRepo.existsById(id)) {
            throw new BookNotFoundException();
        }
        libraryRepo.deleteById(id);
    }
}
