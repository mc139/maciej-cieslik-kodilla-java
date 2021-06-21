package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeWorkObserver {
    private final String name;
    private int taskCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeWork task) {
        System.out.println(name + ": New homework to check" + task.getName() + "\n" +
                " (total: " + task.getTasks().size() + " task)");
        taskCount++;

    }

    public String getName() {
        return name;
    }

    public int getTaskCount() {
        return taskCount;
    }
}
