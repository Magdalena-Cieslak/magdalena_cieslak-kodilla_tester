package com.kodilla.abstracts.homework.zad1;

import com.kodilla.abstracts.homework.zad1.Shape;

public class Rectangle extends Shape {
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void surfaceArea() {
        int surface = sideA * sideB;
        System.out.println("The surface area of the rectangle is " + surface);
    }

    @Override
    public void circuit() {
        int circuit = 2 * sideA + 2 * sideB;
        System.out.println("The circuit of the rectangle is " + circuit);
    }
}
