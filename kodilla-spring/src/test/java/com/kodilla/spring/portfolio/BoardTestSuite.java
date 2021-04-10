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

        String ip = "inProgress";
        String dn = "done";
        String td = "todo";
        board.getDoneList().getTasks().add(dn);
        board.getInProgressList().getTasks().add(ip);
        board.getToDoList().getTasks().add(td);

        //THEN
        Assertions.assertEquals("done",board.getDoneList().getTasks().get(0));
        Assertions.assertEquals("inProgress",board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("todo",board.getToDoList().getTasks().get(0));

    }

}
