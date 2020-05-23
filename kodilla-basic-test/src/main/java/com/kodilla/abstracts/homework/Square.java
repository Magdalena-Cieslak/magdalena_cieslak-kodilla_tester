package com.kodilla.abstracts.homework;

public class Square extends Shape {


    public Square(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public void surfaceArea() {
        int surface = getSideA() * getSideA();
        System.out.println("The surface area of the square is " + surface);
    }

    @Override
    public void circuit() {
        int circuit = 4 * getSideA();
        System.out.println("The circuit of the square is " + circuit);
    }

}
