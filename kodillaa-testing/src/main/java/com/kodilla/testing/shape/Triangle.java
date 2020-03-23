package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private double h;
    private double a;

    public Triangle(String shapeName, double h, double a) {
        this.shapeName = shapeName;
        this.h = h;
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return (h*a)/2;
    }
}
