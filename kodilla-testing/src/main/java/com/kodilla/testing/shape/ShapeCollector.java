package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    static List<Shape> shapes = new ArrayList<>();

    public ShapeCollector(List<Shape> shapes) {
        this.shapes = shapes;
    }

    static void addFigure(Shape shapeToAdd) {

        shapes.add(shapeToAdd);

    }

    static void removeFigure(Shape shapeToRemove) {

        shapes.remove(shapeToRemove);

    }

    static Object getFigure(int n) {
        Object output = shapes.get(n);
        return output;
    }

    public static String showFigures() {
        String connectedString = "";
        for (int i = 0; i < shapes.size(); i++) {
            connectedString += String.valueOf(shapes.get(i)) + ",";
        }

        return connectedString;

    }

}
