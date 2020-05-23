package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int sideA;
    private int sideB;
    private int sideC;
    private int surface;
    private int circuit;

    public Shape(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public abstract void surfaceArea();

    public abstract void circuit();
}
