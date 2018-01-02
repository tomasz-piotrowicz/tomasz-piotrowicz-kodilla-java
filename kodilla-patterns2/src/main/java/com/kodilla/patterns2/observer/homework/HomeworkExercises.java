package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class HomeworkExercises implements Observable {
    private final List<Observer> observers;
    private final Queue<String> exercises;
    private final String name;

    public HomeworkExercises(String name) {
        observers = new ArrayList<>();
        exercises = new ArrayDeque<>();
        this.name = name;
    }

    public Queue<String> getExercises() {
        return exercises;
    }

    public String getName() {
        return name;
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
