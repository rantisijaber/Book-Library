package com.rantisi.library.model;


import jakarta.persistence.*;


@Entity
@Table (name = "books")
public class Books {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String author;

    @Column(name = "publication_year")
    private int yearPublished;

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
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Books [id=" + id + ", title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + "]";
    }

}
