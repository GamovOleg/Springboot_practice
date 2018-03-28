package com.springboot.test.model;


import com.springboot.test.Genre;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String isbn;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "authors_books",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors = new ArrayList<Author>();

    public Book(int i, String olimpischer_fruhling, String s, Genre poem) {
    }

    public Book(/*long id,*/    /*,List<Author> authors*/) {
//        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
//        this.authors = authors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

//    @Override
//    public boolean equals(Object o) {
//
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Book book = (Book) o;
//
//        return /*Objects.equals(this.id, book.id)
//                && */Objects.equals(this.title, book.title)
//                && Objects.equals(this.isbn, book.isbn)
//                && Objects.equals(this.genre, book.genre)
//                && this.authors.containsAll(book.authors) && book.authors.containsAll(this.authors);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(/*this.id,*/ this.title, this.isbn, this.genre);
//    }

}
