package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n){
        Shape theFigure = null;
        if(n>=0 && n<shapes.size()) {
            theFigure = shapes.get(n);
        }
        return theFigure;
    }

    public List<Shape> showFigures() {
        return shapes;
    }

    public Integer getShapesSize () {
        int size = shapes.size();
        return size;
    }
}
