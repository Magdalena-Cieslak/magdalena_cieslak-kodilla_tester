package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(2, 0,0);
        square.circuit();
        square.surfaceArea();

        Rectangle rectangle = new Rectangle(2, 4, 0);
        rectangle.circuit();
        rectangle.surfaceArea();
    }
}
