package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "My list description";

    @Test
    void testFindByListName() {
        //GIVEN
        TaskList taskList = new TaskList("List", DESCRIPTION);

        //WHEN
        taskListDao.save(taskList);

        //THEN
        String listName = taskList.getListName();
        List<TaskList> readTask = taskListDao.findByListName("List");
        assertEquals(1, readTask.size());

        //CLEANUP
        taskListDao.delete(taskList);

    }
}
