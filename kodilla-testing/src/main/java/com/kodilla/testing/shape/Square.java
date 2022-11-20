package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

class Square implements Shape {

    double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "SQUARE";
    }

    @Override
    public double getField() {
        return a*a;
    }
}