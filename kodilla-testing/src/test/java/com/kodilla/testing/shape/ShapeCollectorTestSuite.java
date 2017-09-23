package com.kodilla.testing.shape;
import org.junit.*;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector temporaryCollector = new ShapeCollector();
        Shape circle = new Circle();
        //When
        temporaryCollector.addFigure(circle);
        //Then
        Assert.assertEquals(circle, temporaryCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector temporaryCollector = new ShapeCollector();
        Shape circle = new Circle();
        temporaryCollector.addFigure(circle);
        //When
        temporaryCollector.removeFigure(circle);
        //Then
        Assert.assertNull(temporaryCollector.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle();
        ShapeCollector temporaryCollector = new ShapeCollector();
        temporaryCollector.addFigure(circle);
        //When
        temporaryCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, temporaryCollector.getFigure(0));
    }

}
