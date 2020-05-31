package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {

        //Given
        int a = 5;
        int b = 8;

        //When
        int sumResult = calculator.sum(a, b);

        //Then
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {

        //Given
        int a = 9;
        int b = 12;

        //When
        int subtractResult = calculator.subtract(a, b);

        //Then
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquare() {

        //Given
        int a = -2;

        //When
        int squareResult = calculator.square(a);

        //Then
        assertEquals(4, squareResult);

    }

}
