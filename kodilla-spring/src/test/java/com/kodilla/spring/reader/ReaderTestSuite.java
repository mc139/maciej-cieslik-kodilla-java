package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {

    @Test
    void TestRead(){
        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);

        //WHEN THEN
        reader.read();
    }

    @Test
    void TestConditional(){
        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);

        //WHEN
        boolean bookToExist = context.containsBean("book2");

        //THEN
        System.out.println("Bean book2 was found in the container:"+ bookToExist);
    }
}
