package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("todo")
    TaskList toDOTasks;

    @Autowired
    @Qualifier("inProgress")
    TaskList inProgressTasks;

    @Autowired
    @Qualifier("done")
    TaskList doneTasks;

    @Bean
    public Board getBoard() {
        return new Board(toDOTasks,inProgressTasks,doneTasks);
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneTasks() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgressTasks() {
        return new TaskList();
    }

    @Bean(name = "todo")
    @Scope("prototype")
    public TaskList getToDoTasks() {
        return new TaskList();
    }

}
