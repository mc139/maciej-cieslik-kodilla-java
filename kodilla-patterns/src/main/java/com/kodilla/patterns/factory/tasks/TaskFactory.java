package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Drive back home", "Home", "Mercedes");
            case PAINTINGTASK:
                return new PaintingTask("Painting walls", "BLUE", "BLUE");
            case SHOPPINGTASK:
                return new ShoppingTask("Weekly shopping", "Bread and bananas", 6);
            default:
                return null;
        }
    }
}
