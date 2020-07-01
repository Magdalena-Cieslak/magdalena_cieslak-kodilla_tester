package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order books = new Order(120, LocalDate.of(2020, 02, 20),"delta01");
    Order shoes = new Order(250, LocalDate.of(2020, 02,05), "meggie");
    Order notebook = new Order(1200, LocalDate.of(2020, 03,25), "sunshine123");

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
        List<Order> result = shop.returnOrdersWithinGivenDateRange(LocalDate.of(2020,01, 01), LocalDate.of(2020, 03,01));

        //then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldReturnOrdersWithinGivenValueRange() {
        //when
        List<Order> result = shop.returnOrdersWithinGivenValueRange(100, 500);

        //then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldSumValuesOfOrders() {
        //when
        int sum = shop.sumOrderValues();

        //then
        assertEquals(1570, sum);
    }
    @BeforeEach
    public void initializeShop() {
        shop.addOrder(books);
        shop.addOrder(shoes);
        shop.addOrder(notebook);
    }
}
