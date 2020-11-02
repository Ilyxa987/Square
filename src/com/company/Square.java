package com.company;

public class Square {

    private double x;
    private double y;
    private double length;

    public Square() {
        this.x = 0;
        this.y = 0;
        this.length = 1;
    }

    public Square(double x, double y, double length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double dia(){
        double dia = Math.sqrt(2 * length * length);
        return dia;
    }
}
