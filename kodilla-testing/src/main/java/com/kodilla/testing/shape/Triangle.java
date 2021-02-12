package com.kodilla.testing.shape;

public class Triangle implements Shape{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideLength, sideLength) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        if (Double.compare(triangle.param, param) != 0) return false;
        return name != null ? name.equals(triangle.name) : triangle.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(sideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(param);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

    String name = "Triangle";

    double sideLength;
    double height;

    public Triangle(double sideLength, double height) {
        this.sideLength = sideLength;
        this.height = height;
    }
    double param = sideLength * height;

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField(double param) {
        return param * 0.5;
    }
}
