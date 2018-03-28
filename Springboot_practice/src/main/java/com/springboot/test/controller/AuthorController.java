package com.springboot.test.controller;

import com.springboot.test.model.Author;
import com.springboot.test.repository.AuthorRepository;
import com.springboot.test.service.AuthorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @RequestMapping(value = "/author/{id}", method = RequestMethod.GET)
    public Author get(@PathVariable long id) {
        return authorRepository.findOne(id);
    }

//    @RequestMapping(value = "/author/{name}", method = RequestMethod.GET)
//    public List<Author> findAuthorByFirstName(@RequestParam (value = "name") String name){
//        return authorService.getAuthorByFirstName(name);
//    }

//    @RequestMapping(value = "/author/{lastName}", method = RequestMethod.GET)
//    public List<Author> findAuthorByLastName(@RequestParam (value = "name") String lastName){
//        return authorService.getAuthorByLastName(lastName);
//    }

    @RequestMapping(value = "/author", method = RequestMethod.POST)
    public void create(@RequestBody Author author) {
        authorRepository.saveAndFlush(author);
    }

    @RequestMapping(value = "/author", method = RequestMethod.PUT)
    public void update(@RequestBody Author author) {
        Author authorInDb = authorRepository.findOne(author.getId());
        BeanUtils.copyProperties(author, authorInDb);
        authorRepository.saveAndFlush(authorInDb);
    }
}
