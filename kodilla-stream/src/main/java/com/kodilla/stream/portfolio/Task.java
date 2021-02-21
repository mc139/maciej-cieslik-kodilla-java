package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public class Task {

    private final String title;
    private final String descripion;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(String title, String descripion, User assignedUser,
                User creator, LocalDate created, LocalDate deadline) {
        this.title = title;
        this.descripion = descripion;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescripion() {
        return descripion;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", descripion='" + descripion + '\'' +
                ", assignedUser=" + assignedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}';
    }
}
