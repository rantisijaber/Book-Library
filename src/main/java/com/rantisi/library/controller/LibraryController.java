package com.rantisi.library.controller;
import com.rantisi.library.model.Book;
import com.rantisi.library.service.LibraryService;
import org.springframework.http.HttpStatus;
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
   public List<Book> findAll() {
        return libraryService.findAll();
    }

   @GetMapping("/{id}")
   public Book findById(@PathVariable Integer id) {
        return libraryService.findById(id);
   }

   @ResponseStatus(HttpStatus.CREATED)
   @PostMapping("")
   public void create(@RequestBody Book book) {
       libraryService.create(book);
   }

   @ResponseStatus(HttpStatus.NO_CONTENT)
   @PutMapping("/{id}")
   public void update(@RequestBody Book book, @PathVariable Integer id) {
       libraryService.update(book, id);
   }

   @ResponseStatus(HttpStatus.NO_CONTENT)
   @DeleteMapping("/{id}")
   public void delete(@PathVariable Integer id) {
        libraryService.delete(id);
   }











}




