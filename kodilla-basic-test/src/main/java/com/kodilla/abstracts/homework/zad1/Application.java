package com.kodilla.abstracts.homework.zad1;

import com.kodilla.abstracts.homework.zad1.Rectangle;
import com.kodilla.abstracts.homework.zad1.Square;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(2);
        square.circuit();
        square.surfaceArea();

        Rectangle rectangle = new Rectangle(2, 4);
        rectangle.circuit();
        rectangle.surfaceArea();

        Circle circle = new Circle(3);
        circle.circuit();
        circle.surfaceArea();
    }
}
