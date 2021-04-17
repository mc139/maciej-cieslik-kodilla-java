package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TaskFactoryTestSuite {
    @Test
    void testDrivingTask() {
        //GIVEN
        TaskFactory taskFactory = new TaskFactory();

        //WHEN
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);

        //THEN
        assertEquals(false, drivingTask.isTaskExecuted());
        drivingTask.executeTask(LocalDate.of(2021, 02, 1));
        assertEquals(true, drivingTask.isTaskExecuted());
        assertEquals("Drive back home", drivingTask.getTaskName());
    }

    @Test
    void testShoppingTask() {

        //GIVEN
        TaskFactory taskFactory = new TaskFactory();

        //WHEN
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);

        //THEN
        assertEquals(false, shoppingTask.isTaskExecuted());
        shoppingTask.executeTask(LocalDate.of(2021, 12, 1));
        assertEquals(false, shoppingTask.isTaskExecuted());
        assertEquals("Weekly shopping", shoppingTask.getTaskName());

    }

    @Test
    void testPaintingTask() {

        //GIVEN
        TaskFactory taskFactory = new TaskFactory();

        //WHEN
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);

        //THEN

        assertEquals(false, paintingTask.isTaskExecuted());
        paintingTask.executeTask(LocalDate.of(2014, 12, 11));
        assertEquals(true, paintingTask.isTaskExecuted());
        assertNotEquals("random painting", paintingTask.getTaskName());
    }

}
