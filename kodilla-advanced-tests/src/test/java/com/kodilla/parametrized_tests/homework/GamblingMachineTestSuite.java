package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

        @ParameterizedTest
        @CsvFileSource(resources = "/intNumbersSources.csv", numLinesToSkip = 1)
        public void shouldThrowExceptionWhenNumbersAreDifferentFromSix(int input)  {

        }

    }