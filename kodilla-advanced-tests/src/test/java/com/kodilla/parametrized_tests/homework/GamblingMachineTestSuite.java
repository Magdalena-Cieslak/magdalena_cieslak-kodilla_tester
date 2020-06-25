package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/intNumbersSources_GreaterThanSix.csv")
    public void shouldThrowExceptionWhenNumberOfNumbersIsGreaterThanSix(Set<Integer> input){
        InvalidNumbersException thrown = assertThrows(
                InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(input),
                "Expected howManyWins() to throw, but it didnt't"
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/intNumbersSources_LessThanSix.csv")
    public void shouldThrowExceptionWhenNumberOfNumbersIsLessThanSix(Set<Integer> input) {
        InvalidNumbersException thrown = assertThrows(
                InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(input),
                "Expected howManyWins() to throw, but it didnt't"
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/intNumbersSources_numbersLessOne.csv")
    public void shouldThrowExceptionWhenNumbersAreLessThanOne(Set<Integer> input) {
        InvalidNumbersException thrown = assertThrows(
                InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(input),
                "Expected howManyWins() to throw, but it didnt't"
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/intNumbersSources_correct.csv")
    public void shouldCalculateHowManyWins(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> integers = new HashSet<>();
        integers.add(one);
        integers.add(two);
        integers.add(three);
        integers.add(four);
        integers.add(five);
        integers.add(six);

        int result = gamblingMachine.howManyWins(integers);
    }
}