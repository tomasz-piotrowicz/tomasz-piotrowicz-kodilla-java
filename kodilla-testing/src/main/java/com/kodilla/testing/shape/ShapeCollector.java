package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {

    ArrayList<Shape> figureList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figureList.add(shape);
    }

    public void removeFigure(Shape shape){
        figureList.remove(shape);
    }

    public Shape getFigure(int n){
        if(n >= figureList.size()) {
            return null;
        }
        return figureList.get(n);
    }

    int showFigures(){
        return 0;
    }
}
