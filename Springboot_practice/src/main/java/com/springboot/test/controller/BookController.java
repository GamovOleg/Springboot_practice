package com.springboot.test.controller;

import com.springboot.test.model.Book;
import com.springboot.test.repository.BookRepository;
import com.springboot.test.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "books",method = RequestMethod.GET)
    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    @RequestMapping(value = "book/{id}", method = RequestMethod.GET)
    public Book get(@PathVariable long id){
        return bookRepository.findOne(id);
    }

//    @RequestMapping(value = "/books/name", method = RequestMethod.GET)
//    public List<Book> findBookByAuthorFirstName(@PathVariable(name = "value") String authors){
//        return bookService.getBookByAuthorFirstName(authors);
//    }

//    @RequestMapping(value = "/books/lastname", method = RequestMethod.GET)
//    public List<Book> findBookByAuthorLastName(@PathVariable(name = "value") String authors){
//        return bookService.getBookByAuthorLastName(authors);
//    }

    @RequestMapping(value = "/book/{title}", method = RequestMethod.GET)
    public List<Book> findBookByTitle(@RequestParam(name = "value") String title){
        return bookService.getBookByTitle(title);
    }

    @RequestMapping(value = "/book/{isbn}", method = RequestMethod.GET)
    public List<Book> findBookByIsbn(@RequestParam(name = "value")int isbn){
        return bookService.getBookByIsbn(isbn);
    }

    @RequestMapping(value = "/book/{genre}", method = RequestMethod.GET)
    public List<Book> findBookByGenre(@RequestParam(name = "value")String genre){
        return bookService.getBookByGenre(genre);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public void create(@RequestBody Book book){
        bookRepository.saveAndFlush(book);
    }

    @RequestMapping(value = "/book", method = RequestMethod.PUT)
    public void update(@RequestBody Book book){
        Book bookInDb = bookRepository.findOne(book.getId());
        BeanUtils.copyProperties(book, bookInDb);
        bookRepository.saveAndFlush(bookInDb);
    }
}
