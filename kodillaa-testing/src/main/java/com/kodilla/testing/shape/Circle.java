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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }
}
