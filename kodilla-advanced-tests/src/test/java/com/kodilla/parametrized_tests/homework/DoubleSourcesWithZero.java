package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSourcesWithZero {

    static Stream<Arguments> provideDoubleForTestingBMI() {
        return Stream.of(
                Arguments.of(0, 65.0, "Height is not correct, try again"),
                Arguments.of(0, 75.0, "Height is not correct, try again")
        );
    }
}
