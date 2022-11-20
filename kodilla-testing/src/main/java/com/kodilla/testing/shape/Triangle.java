package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

class Triangle implements Shape {

    double a,h;
    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "TRIANGLE";
    }

    @Override
    public double getField() {
        return (1/3)*a*h;
    }
}