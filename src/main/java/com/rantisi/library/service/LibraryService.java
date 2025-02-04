package com.rantisi.library.service;

import com.rantisi.library.exceptions.BookNotFoundException;
import com.rantisi.library.model.Book;
import com.rantisi.library.repository.LibraryRepo;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    private final LibraryRepo libraryRepo;

    public LibraryService(LibraryRepo libraryRepo) {
        this.libraryRepo = libraryRepo;
    }

    public List<Book> findAll() {
        return libraryRepo.findAll();
    }

    public Book findById(Integer id) {
        Optional<Book> book = libraryRepo.findById(id);
        if (book.isEmpty()) {
            throw new BookNotFoundException();

        }
        return book.get();
    }
    public void create(Book book) {
        libraryRepo.save(book);
    }

    public void update(Book book, Integer id) {
        if (!libraryRepo.existsById(id)) {
            throw new BookNotFoundException();
        }
        book.setId(id);
        libraryRepo.save(book);
    }
    public void delete(Integer id) {
        if (!libraryRepo.existsById(id)) {
            throw new BookNotFoundException();
        }
        libraryRepo.deleteById(id);
    }
}
