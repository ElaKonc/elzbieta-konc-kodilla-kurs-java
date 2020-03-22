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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.h, h) != 0) return false;
        return Double.compare(triangle.a, a) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(h);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
