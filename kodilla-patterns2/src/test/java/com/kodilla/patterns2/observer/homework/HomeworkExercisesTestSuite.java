package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkExercisesTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkExercises jimsHomework = new JimsHomework();
        HomeworkExercises petersHomework = new PetersHomework();
        KodillaMentor frankSinatra = new KodillaMentor("Frank Sinatra");
        KodillaMentor jonBonJovi = new KodillaMentor("Jon Bon Jovi");
        jimsHomework.registerObserver(frankSinatra);
        petersHomework.registerObserver(jonBonJovi);
        //When
        jimsHomework.addExercise("For loop practise");
        jimsHomework.addExercise("Collection Framework introduction");
        petersHomework.addExercise("Spring & Hibernate practise");
        //Then
        assertEquals(2, frankSinatra.getUpdateCount());
        assertEquals(1, jonBonJovi.getUpdateCount());
    }
}
