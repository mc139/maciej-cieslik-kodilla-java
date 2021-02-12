package com.kodilla.testing.shape;

public class Square implements Shape {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.sideLength, sideLength) != 0) return false;
        if (Double.compare(square.param, param) != 0) return false;
        return name != null ? name.equals(square.name) : square.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(sideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(param);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

    String name = "Square";

    double sideLength;

    public Square(double sideLenght) {
        this.sideLength = sideLenght;
    }

    double param = sideLength;

    @Override
    public String getShapeName() {
        return name;
    }


    @Override
    public double getField(double param) {
        return param * param;

    }
}
