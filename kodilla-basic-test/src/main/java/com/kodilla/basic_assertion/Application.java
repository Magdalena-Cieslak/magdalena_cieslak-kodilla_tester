package com.kodilla.basic_assertion;

import java.util.concurrent.Callable;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sumNumbers(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sumNumbers działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sumNumbers nie działa porawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator1 = new Calculator();
        a = 7;
        b = 9;
        int subtractResult = calculator1.subtractNumbers(a, b);
        correct = ResultChecker.assertEquals(-2, subtractResult);
        if (correct) {
            System.out.println("Metoda subtractNumbers działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtractNumbers nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator2 = new Calculator();
        a = 9;
        int squareResult = calculator2.square(a);
        correct = ResultChecker.assertEquals(81, squareResult);
        if (correct) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }
}
