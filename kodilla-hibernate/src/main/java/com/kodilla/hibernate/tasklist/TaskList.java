package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TASKLIST")
public class TaskList {

    private int id;
    private String listName;
    private String description;

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
