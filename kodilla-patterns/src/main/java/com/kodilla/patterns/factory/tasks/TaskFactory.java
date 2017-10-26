package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String SHOPPINGTASK = "SHOPPING TASK";

    public final Task makeShape(final String shapeClass){
        switch(shapeClass){
            case DRIVINGTASK:
                return new DrivingTask("driving", "warehouse", "truck");
            case PAINTINGTASK:
                return new PaintingTask("to paint", "in black", "fence");
            case SHOPPINGTASK:
                return new ShoppingTask("to buy", "black paint",20.0);
            default:
                return null;
        }
    }
}
