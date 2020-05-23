package com.kodilla.abstracts.homework.zad1;

import com.kodilla.abstracts.homework.zad1.Shape;

public class Square extends Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void surfaceArea() {
        int surface = side * side;
        System.out.println("The surface area of the square is " + surface);
    }

    @Override
    public void circuit() {
        int circuit = 4 * side;
        System.out.println("The circuit of the square is " + circuit);
    }

}
