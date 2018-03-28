package com.springboot.test.repository;

import com.springboot.test.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findBookByTitle(String title);

    List<Book> findBookByIsbn(int isbn);

    List<Book> findBookByGenre(String genre);

//    List<Book> findBookByAuthorsFirstName(String name);

//    List<Book> findBookByAuthorsLastName(String lastName);
}
