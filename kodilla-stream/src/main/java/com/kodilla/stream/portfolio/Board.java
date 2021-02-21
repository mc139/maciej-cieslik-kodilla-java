package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {

    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(String name) {
        this.name = name;
    }
    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }

    public void addTaskList(TaskList taskList){
        taskLists.add(taskList);
    }

    public boolean removeTaskList(){
        return taskLists.remove(taskLists);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" +
                "taskLists=" + taskLists +
                ", name='" + name + '\'' +
                '}';
    }
}
