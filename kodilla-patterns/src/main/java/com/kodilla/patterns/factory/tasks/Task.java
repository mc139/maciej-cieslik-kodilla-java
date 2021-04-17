package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public interface Task {
    void executeTask(LocalDate dateOfExecution);
    String getTaskName();
    boolean isTaskExecuted();
}
