package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> returnOrdersWithinGivenDateRange(LocalDate date) {
        LocalDate localDate_one = LocalDate.of(2020, 03, 01);
        LocalDate localDate_two = LocalDate.of(2020, 03, 30);

        //potrzebuję wskazówki jak zbudować ciało tej metody

        return orders;
    }

    public Order getOrder(int value) {
        int valueMin = 0;
        int valueMax = 100;
        if(value > valueMin && value < valueMax) {
            return this.orders.get(value);
        }
        return null;
    }

    public int getSize() {
        return this.orders.size();
    }

    public void sumOrderValues(int value) {
        int sum = 0;
        for(int i = 0; i < orders.size(); i++) {
            sum = sum + orders.getValue(i);
        }
    }
}
