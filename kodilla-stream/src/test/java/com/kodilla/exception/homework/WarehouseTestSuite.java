package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void getOrder() throws OrderDoesntExistException {

        //given
        Warehouse warehouse = new Warehouse();
        Order one = new Order("one");
        Order two = new Order("two");
        warehouse.addOrder(one);
        warehouse.addOrder(two);

        //when
        Order result = warehouse.getOrder("two");

        //then
        assertEquals(two, result);
    }

    @Test
        public void getOrder_withException() throws OrderDoesntExistException {

        //given
        Warehouse warehouse = new Warehouse();
        Order one = new Order("one");
        Order two = new Order("two");
        warehouse.addOrder(one);
        warehouse.addOrder(two);

        //when
        Order result = warehouse.getOrder("three");

        //then
        assertEquals(expected, result);
    }
}