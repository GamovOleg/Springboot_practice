package com.springboot.test.service;


import com.springboot.test.model.Book;
import com.springboot.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    public List<Book> getBookByIsbn(int isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }

    public List<Book> getBookByGenre(String genre) {
        return bookRepository.findBookByGenre(genre);
    }

//    public List<Book> getBookByAuthorFirstName(String authors) {
//        return bookRepository.findBookByAuthorsFirstName(authors);
//    }

//    public List<Book> getBookByAuthorLastName(String authors) {
//        return bookRepository.findBookByAuthorsLastName(authors);
//    }

}
