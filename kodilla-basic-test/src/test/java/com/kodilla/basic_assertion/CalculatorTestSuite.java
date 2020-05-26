package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator1 = new Calculator();
        int a = 9;
        int b = 12;
        int subtractResult = calculator1.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator2 = new Calculator();
        int a = -2;
        int squareResult = calculator2.square(a);
        assertEquals(4, squareResult);

        int b = 0;
        int squareResult1 = calculator2.square(b);
        assertEquals(0, squareResult1);

        int c = 3;
        int squareResalt2 = calculator2.square(c);
        assertEquals(9, squareResalt2);

    }

}
