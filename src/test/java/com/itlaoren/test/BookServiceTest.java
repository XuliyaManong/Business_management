package com.itlaoren.test;

import com.itlaoren.config.SpringConfig;
import com.itlaoren.domain.Book;
import com.itlaoren.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testSelectAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
    @Test
    public void testSelectById(){
        Book byId = bookService.getById(27);
        System.out.println(byId);
    }
}
