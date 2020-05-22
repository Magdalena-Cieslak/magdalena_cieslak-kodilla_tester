package com.kodilla.abstracts.homework;

public class Square extends Shape {
    int a;
    int surface = a * a;
    int circuit = 4 * a;

    @Override
    public void surfaceArea() {
        System.out.println("The surface area of the square is " + surface);
    }

    @Override
    public void circuit() {
        System.out.println("The circuit of the square is " + circuit);
    }

}
