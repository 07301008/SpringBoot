package com.itlxl;

import com.itlxl.dao.BookDao;
import com.itlxl.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById() {
        Book book = bookDao.getById(1);
        System.out.println(book);
    }

}
