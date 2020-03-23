package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;
    private double r;

    public Circle(String shapeName, double r) {
        this.shapeName = shapeName;
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (r*r)*3.14;
    }
}
