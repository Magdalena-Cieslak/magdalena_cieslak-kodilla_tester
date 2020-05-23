package com.kodilla.abstracts.homework.zad1;

public class Circle extends Shape {
    int radius;
    static final double PI = 3.1415927;

    public Circle (int radius) {
        this.radius = radius;
    }


    @Override
    public void surfaceArea() {
        int surface = (int) (PI * radius * radius);
        System.out.println("The surface area of the circle is " + surface);
    }

    @Override
    public void circuit() {
        int circuit = (int) (2 * PI * radius);
        System.out.println("The circuit of the circle is " + circuit);

    }
}
