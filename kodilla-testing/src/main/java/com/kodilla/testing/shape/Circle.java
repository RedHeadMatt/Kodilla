package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

class Circle implements Shape {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "CIRCLE";
    }

    @Override
    public double getField() {
        return 3.14*radius*radius;
    }
}