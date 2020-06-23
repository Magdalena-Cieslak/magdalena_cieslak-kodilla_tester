package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    Person person_1 = new Person(1.65, 85);
    Person person_2 = new Person(1.85, 90);
    Person person_3 = new Person(1.2, 20);
    Person person_4 = new Person(0.0, 35);

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSources#provideDoubleForTestingBMI")
    public void shouldCalculateBmi(double input, double expected, double delta) {

        assertEquals(expected, person_1.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSourcesWithZero#provideDoubleForTestingBMI")
    public void shouldNotCalculateBmiWhenHeightIsZero(double input, double expected) {
        assertEquals(expected, person_4.getBMI());

    }
}