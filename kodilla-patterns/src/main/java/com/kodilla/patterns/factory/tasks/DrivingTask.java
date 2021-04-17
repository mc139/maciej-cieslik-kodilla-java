package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean isDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask(LocalDate dateOfExecution) {
        if (dateOfExecution.isBefore(LocalDate.now())) {
            isDone = true;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
