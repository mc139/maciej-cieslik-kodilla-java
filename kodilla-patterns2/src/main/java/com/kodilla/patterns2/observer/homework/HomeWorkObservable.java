package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface HomeWorkObservable {
    void registerObserver(HomeWorkObserver observer);

    void notifyObservers();

    void removeHomeWorkObserver(HomeWorkObserver observer);
}
