package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.inProgressList.tasks.add("Learning about Spring");
        board.toDoList.tasks.add("Complete Kodilla course");
        board.doneList.tasks.add("Complete internal exam");
        //Then
        Assert.assertEquals("Learning about Spring", board.inProgressList.tasks.get(0));
        Assert.assertEquals("Complete Kodilla course", board.toDoList.tasks.get(0));
        Assert.assertEquals("Complete internal exam", board.doneList.tasks.get(0));
    }
}
