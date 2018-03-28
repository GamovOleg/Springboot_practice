package com.springboot.test.serviceControllerTest;


import com.springboot.test.Genre;
import com.springboot.test.controller.BookController;
import com.springboot.test.model.Book;
import com.springboot.test.repository.BookRepository;
import com.springboot.test.service.BookService;
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
public class BookTest {

    @InjectMocks
    private BookController bookController;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private BookService bookService;

    @Test
    public void getBook() throws Exception {
        Book book = new Book();
        book.setId(1L);
        when(bookRepository.findOne(1L)).thenReturn(book);

        Book bk = bookController.get(1L);

        verify(bookRepository).findOne(1L);

        assertThat(bk.getId(), is(1L));

    }

    @Test
    public void addNewBook() throws Exception {
        Book book = new Book(1, "Olimpischer Fruhling", "9783846089590", Genre.POEM);
        when(bookController.get(1L)).thenReturn(book);

        bookController.create(book);

        Book bk = bookController.get(1L);

        assertThat(bk.getId(), is(1L));

    }

}


