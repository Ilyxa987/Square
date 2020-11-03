package com.company;

public class Rectangle extends Square {

    private double x;
    private double y;
    private double length;
    private double width;

    public Rectangle(double x, double y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.length = 1;
        this.width = 1;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double dia() {
        return Math.sqrt(length * length + width * width);
    }

    public double S() {
        return width * length;
    }
}
