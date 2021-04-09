package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    Board board;

    @Bean
    public Board getBoard() {
        return new Board(getToDoTasks(),getInProgressTasks(),getDoneTasks());
    }

    @Bean(name = "done tasks")
    public TaskList getDoneTasks() {
        return new TaskList();
    }

    @Bean(name = "in progress")
    public TaskList getInProgressTasks() {
        return new TaskList();
    }

    @Bean(name = "to do")
    public TaskList getToDoTasks() {
        return new TaskList();
    }

}
