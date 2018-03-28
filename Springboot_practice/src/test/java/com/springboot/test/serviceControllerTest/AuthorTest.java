package com.springboot.test.serviceControllerTest;


import com.springboot.test.controller.AuthorController;
import com.springboot.test.model.Author;
import com.springboot.test.repository.AuthorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AuthorTest {

    @InjectMocks
    private AuthorController authorController;

    @Mock
    private AuthorRepository authorRepository;

    @Test
    public void getAuthorTest() throws Exception {
        Author author = new Author();
        author.setId(1L);

        when(authorRepository.findOne(1L)).thenReturn(author);

        Author autr = authorController.get(1L);

        verify(authorRepository).findOne(1L);

        assertThat(autr.getId(), is(1L));
    }


}
