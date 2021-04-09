package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void TestTaskAdd(){

        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //WHEN
        board.getDoneList().add("Done Task");
        board.getInProgressList().add("In Progress Task");
        board.getToDoList().add("ToDO Task");

        //THEN
        Assertions.assertEquals("Done Task",board.getDoneList().getTasks().get(0));
        Assertions.assertEquals("In Progress Task",board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("ToDO Task",board.getToDoList().getTasks().get(0));





    }

}
