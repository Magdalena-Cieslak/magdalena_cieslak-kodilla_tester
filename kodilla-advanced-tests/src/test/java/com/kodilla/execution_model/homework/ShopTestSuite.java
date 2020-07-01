package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order books = new Order(120, (2020-02-20), "delta01");
    Order shoes = new Order(250, (2020-02-05), "meggie");
    Order notebook = new Order(1200, (2020-03-25), "sunshine123");

    @Test
    public void shouldAddOrderToShop() {
        //when
        int numberOfOrders = shop.getSize();

        //then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldReturnOrdersWithinGivenDateRange() {
        //when
        List<Order> result = shop.returnOrdersWithinGivenDateRange(2020-01-01, 2020-03-01);

        //then
        assertEquals(2020-02-20, result);
        assertEquals(2020-02-05, result);
    }

    @Test
    public void shouldReturnOrdersWithinGivenValueRange() {
        //when
        List<Order> result = shop.returnOrdersWithinGivenValueRange(100, 500);

        //then
        assertEquals(120, result);
        assertEquals(250, result);
    }

    @Test
    public void shouldSumValuesOfOrders() {
        //when
        int sum = shop.sumOrderValues();

        //then
        assertEquals(1570, sum);
    }
}
