package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n){
        if(n>-1 && n<shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }

    public List<Shape> showFigures() {
        return shapes;
    }
}
