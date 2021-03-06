package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSources {

    static Stream<Arguments> provideDoubleForTestingBMI() {
        return Stream.of(
                Arguments.of(1.5, 65.0, "Overweight"),
                Arguments.of(1.85, 75.0, "Normal (healthy weight)"),
                Arguments.of(1.2, 18.0, "Very severely underweight")
        );
    }
}
