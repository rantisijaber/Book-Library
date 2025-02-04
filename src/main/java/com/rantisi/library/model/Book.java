package com.rantisi.library.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@Entity
@Table (name = "books")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String author;

    @JsonProperty("publication")
    @Column(name = "publication_year")
    private int yearPublished;

    public Book() {}

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Book(int id, String title, String author, int yearPublished) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }






}
