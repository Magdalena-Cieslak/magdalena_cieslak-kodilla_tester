package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSources#provideDoubleForTestingBMI")
    public void shouldCalculateBmi(double height, double weight, String expected) {
        Person person = new Person(height, weight);

        assertEquals(expected, person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSourcesWithZero#provideDoubleWithZeroForTestingBMI")
    public void shouldNotCalculateBmiWhenHeightIsZero(double height, double weight, String expected) {
        Person person = new Person(height, weight);

        assertEquals(expected, person.getBMI());
    }
}