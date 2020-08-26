package com.kodilla.jacoco;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class YearTest {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4AndNotDivisibleBy100() {
        //given
        Year year = new Year(1040);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldntBeLeapYearIfDivisibleBy4AndBy100() {
        //given
        Year year = new Year(1200);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertNotEquals(1200, year.isLeap());
    }

    @Test
    public void shouldntBeLeapYearIfNotDivisibleBy400() {
        //given
        Year year = new Year(1300);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertNotEquals(1300, year.isLeap());
    }

    @Test
    public void shouldntBeLeapYearIfNotDivisibleBy4AndBy100AndBy400() {
        //given
        Year year = new Year(1217);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertNotEquals(1217, year.isLeap());
    }
}
