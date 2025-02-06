package com.rantisi.library.controller;

import com.rantisi.library.model.Book;
import org.springframework.ui.Model;

import com.rantisi.library.service.LibraryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/books")
public class PageController {

    final private LibraryService libraryService;

    public PageController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping
    public String renderBooks(Model model) {
        List<Book> books = libraryService.findAll();
        model.addAttribute("books", books);
        return "index";
    }

    @GetMapping("/search")
    public String search(Model model, @RequestParam(name = "id", required = false) Integer id) {
        Book book = null;
        if (id != null) {
            book = libraryService.findById(id, false);
            if (book == null) {
                model.addAttribute("error", "Book not found at ID: " + id);
            } else {
                model.addAttribute("book", book);
            }
        }

        return "search";
    }


}
