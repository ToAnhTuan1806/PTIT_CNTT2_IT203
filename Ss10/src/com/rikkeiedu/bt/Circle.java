package com.rikkeiedu.bt;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //tính diện tích
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    //tính chu vi
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
