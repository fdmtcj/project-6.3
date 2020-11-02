package com.kodilla.testing.shape;

public class Square implements Shape {

    final String shapeName;
    final double field;


    public Square(double sideLength) {
        this.shapeName = "square";
        this.field = sideLength * sideLength;

    }

    public String getShapeName() {

        return this.shapeName;
    }

    public double getField() {

        return this.field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}


