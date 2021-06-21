package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class HomeWork implements HomeWorkObservable {
    private final List<HomeWorkObserver> observers;
    private final List<String> tasks;
    private final String name;

    public HomeWork(String name) {
        this.observers =new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeWorkObserver observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for (HomeWorkObserver homeWorkObserver : observers) {
            homeWorkObserver.update(this);
        }
    }


    @Override
    public void removeHomeWorkObserver(HomeWorkObserver observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
