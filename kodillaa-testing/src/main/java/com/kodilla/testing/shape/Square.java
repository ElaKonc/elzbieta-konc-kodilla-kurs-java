package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private double a;

    public Square(String shapeName, double a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return a*a;
    }
}
