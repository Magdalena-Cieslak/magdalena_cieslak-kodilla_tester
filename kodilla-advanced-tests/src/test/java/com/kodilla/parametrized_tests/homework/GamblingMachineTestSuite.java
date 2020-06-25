package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/intNumbersSources_GreaterThanSix.csv")
    public void shouldThrowExceptionWhenNumberOfNumbersIsGreaterThanSix(Set<Integer> input) throws InvalidNumbersException {
        InvalidNumbersException thrown = assertThrows(
                InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(input),
                "Expected howManyWins() to throw, but it didnt't"
        );
    }

    @ParameterizedTest(expected = InvalidNumbersException.class)
    @CsvFileSource(resources = "/intNumbersSources_LessThanSix.csv")
    public void shouldThrowExceptionWhenNumberOfNumbersIsLessThanSix(Set<Integer> input) throws InvalidNumbersException {
        gamblingMachine.howManyWins(input);
    }

    @ParameterizedTest(expected = InvalidNumbersException.class)
    @CsvFileSource(resources = "/intNumbersSources_numbersLessOne.csv")
    public void shouldThrowExceptionWhenNumbersAreLessThanOne(Set<Integer> input) throws InvalidNumbersException {
        gamblingMachine.howManyWins(input);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/intNumbersSources_correct.csv")
    public void shouldCalculateHowManyWins(Set<Integer> input) throws InvalidNumbersException {
        int result = gamblingMachine.howManyWins(input);

    }
}