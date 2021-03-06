package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSourcesWithZero {

    static Stream<Arguments> provideDoubleWithZeroForTestingBMI() {
        return Stream.of(
                Arguments.of(0.0, 65.0, "Obese Class VI (Hyper Obese)"),
                Arguments.of(0.0, 75.0, "Obese Class VI (Hyper Obese)")
        );
    }
}
