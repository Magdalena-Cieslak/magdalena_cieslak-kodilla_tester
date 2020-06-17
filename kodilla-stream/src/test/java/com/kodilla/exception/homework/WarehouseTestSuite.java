package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test
    public void getOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order orderNumberThree = warehouse.getOrder("three");
        //then
        assertTrue(orderNumberThree);
    }

    @Test (expected = OrderDoesntExistException.class)
    public void getOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order orderNumberThree = warehouse.getOrder("six");
        //then
        assertFalse(orderNumberThree);
    }
}