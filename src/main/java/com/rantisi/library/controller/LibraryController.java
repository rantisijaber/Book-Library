package com.rantisi.library.controller;
import com.rantisi.library.model.Book;
import com.rantisi.library.service.LibraryService;
import org.apache.coyote.Response;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/books")
public class LibraryController {


    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }


    @GetMapping("")
    public ResponseEntity<List<Book>> findAll() {
        return ResponseEntity.ok(libraryService.findAll());
    }

   @GetMapping("/{id}")
   public ResponseEntity<Book> findById(@PathVariable Integer id) {
        Book book = libraryService.findById(id, true);
        if (book == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(book);
   }

    @PostMapping("/create")
    public ResponseEntity<Book> create(@RequestBody Book book) {
        Book createdBook = libraryService.create(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }


   @PutMapping("/{id}")
   public ResponseEntity<Void> update(@RequestBody Book book, @PathVariable Integer id) {
       libraryService.update(book, id);
       return ResponseEntity.noContent().build();
   }

   @DeleteMapping("/delete/{id}")
   public ResponseEntity<Void> delete(@PathVariable Integer id) {
        libraryService.delete(id);
        return ResponseEntity.noContent().build();
   }
}




