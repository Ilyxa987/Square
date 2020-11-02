package com.company;

public class Main {

    public static void main(String[] args) {
	Square a = new Square(0, 0, 2);
        System.out.println(a.dia());
        Rectangle b = new Rectangle(0, 0, 2, 4);
        System.out.println(b.dia());
        System.out.println(b.S());
    }
}
