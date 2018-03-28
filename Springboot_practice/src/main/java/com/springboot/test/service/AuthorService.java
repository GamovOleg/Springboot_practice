package com.springboot.test.service;


import com.springboot.test.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

//    public List<Author> getAuthorByFirstName(String name) {
//        return authorRepository.findAuthorByFirstName(name);
//    }
//
//    public List<Author> getAuthorByLastName(String lastName) {
//        return authorRepository.findAuthorByLastName(lastName);
//    }
}
