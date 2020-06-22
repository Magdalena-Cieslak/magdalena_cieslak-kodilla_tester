package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    Person person = new Person(double height, double weight);

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSources#provideDoubleForTestingBMI")
    public void shouldCalculateBmi(double input, double expected) {
        assertEquals(expected, person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSourcesWithZero#provideDoubleForTestingBMI")
    public void shouldNotCalculateBmiWhenHeightIsZero(double input, double expected) {
        assertEquals(expected, person.getBMI());
    }



}