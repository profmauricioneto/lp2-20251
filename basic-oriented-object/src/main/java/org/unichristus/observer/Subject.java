package org.unichristus.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public boolean isEven(int value) {
        System.out.println("Um evento ocorreu!");
        return value % 2 == 0;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllAttached() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
