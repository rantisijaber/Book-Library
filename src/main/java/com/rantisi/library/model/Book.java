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
    private Integer yearPublished;

    public Book() {}

    public Book(String title, String author, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.yearPublished = publicationYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }
    public Integer getYearPublished() {
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

    public Book(Integer id, String title, String author, Integer yearPublished) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }


    @Override
    public String toString() {
        return "[id=" + id + ", title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + "]";
    }



}
