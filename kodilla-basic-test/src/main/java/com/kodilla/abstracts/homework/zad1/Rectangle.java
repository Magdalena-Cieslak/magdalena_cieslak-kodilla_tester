package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public void surfaceArea() {
        int surface = getSideA() * getSideB();
        System.out.println("The surface area of the rectangle is " + surface);
    }

    @Override
    public void circuit() {
        int circuit = 2 * getSideA() + 2 * getSideB();
        System.out.println("The circuit of the rectangle is " + circuit);
    }
}
