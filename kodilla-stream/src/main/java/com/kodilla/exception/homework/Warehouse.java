package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(Order order) {
        orders.add(new Order(order.getNumber()));
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> optionalOrder = orders.stream()
                .filter(order -> order.getNumber().equals(number))
                .findAny();

        return optionalOrder.orElseThrow(OrderDoesntExistException::new);
    }
}
