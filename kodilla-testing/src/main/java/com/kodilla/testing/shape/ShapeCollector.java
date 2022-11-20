package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeArrayList = new ArrayList<>();

    void addFigure(Shape shape) {
        shapeArrayList.add(shape);

    }

    void removeFigure(Shape shape){
        shapeArrayList.remove(shape);
    }

    Shape getFigure(int i){
        return shapeArrayList.get(i);
    }

    String showFigures() {
        String temp = "";
        for (Shape shapes : shapeArrayList) {
            temp += shapes.getShapeName();
        }
        return temp;
    }



}
