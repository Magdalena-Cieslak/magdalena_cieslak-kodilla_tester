package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Ania-1:true", "ka:false", "a--:true", "AAA_nnn_123:true", " :false", "a!?:false"})
    public void shouldReturnCorrectUsername(String input, boolean expected) {
        assertEquals(expected, userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"Anna.May@gmail.com:true", "Matt@ugzu178.ugzu.mocca:true", "nadia@123.abc.bergmann:false"})
    public void shouldReturnCorrectEmail(String input, boolean expected) {
        assertEquals(expected, userValidator.validateEmail(input));
    }
}