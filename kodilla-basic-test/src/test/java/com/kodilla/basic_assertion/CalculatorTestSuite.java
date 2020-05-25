package com.kodilla.basic_assertion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTestSuite {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {

        //Given
        int a = 5;
        int b = 8;

        //When
        int sumResult = calculator.sumNumbers(a, b);

        //Then
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {

        //Given
        int a = 9;
        int b = 12;

        //When
        int subtractResult = calculator.subtractNumbers(a, b);

        //Then
        assertEquals(-3, subtractResult);
    }

}
