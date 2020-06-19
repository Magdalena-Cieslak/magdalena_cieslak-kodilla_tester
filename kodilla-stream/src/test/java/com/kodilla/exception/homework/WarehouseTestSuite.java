package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test
    public void getOrder() throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();

        Order one = new Order("one");
        Order two = new Order("two");
        warehouse.addOrder(one);
        warehouse.addOrder(two);

        Order res = warehouse.getOrder("two");
        assertEquals(two, res);
    }
}