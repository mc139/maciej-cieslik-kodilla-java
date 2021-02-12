package com.kodilla.testing.shape;

public class Circle implements Shape{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        if (Double.compare(circle.param, param) != 0) return false;
        return name != null ? name.equals(circle.name) : circle.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(param);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

    String name = "Circle";

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double param = radius;

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField(double param) {
        return 3.14 * param * param;
    }
}
