package com.springboot.test.repository;

import com.springboot.test.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>{

//    List<Author> findAuthorByFirstName(String name);

//    List<Author> findAuthorByLastName(String lastName);

}
