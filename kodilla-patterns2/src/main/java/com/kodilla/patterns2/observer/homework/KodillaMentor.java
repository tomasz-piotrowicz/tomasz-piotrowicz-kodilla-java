package com.kodilla.patterns2.observer.homework;

public class KodillaMentor implements Observer {
    private final String name;
    private int updateCount;

    public KodillaMentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkExercises homeworkExercises) {
        System.out.println(name + " : New exercise in quene " + homeworkExercises.getName() + "\n" +
        " (total: " + homeworkExercises.getExercises().size() + " exercises");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
