package com.kodilla.spring.forum;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUsername(){

        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser js = context.getBean(ForumUser.class);

        //WHEN
        String userName = js.userName;

        //THEN

        assertEquals("John Smith",userName);

    }
}
