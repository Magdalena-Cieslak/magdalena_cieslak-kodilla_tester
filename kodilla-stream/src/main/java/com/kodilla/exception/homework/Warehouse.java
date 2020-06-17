package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(Order order) {
        orders.add(new Order(order.getNumber()));
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        orders.stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst();

        throw new OrderDoesntExistException();

    }
}
