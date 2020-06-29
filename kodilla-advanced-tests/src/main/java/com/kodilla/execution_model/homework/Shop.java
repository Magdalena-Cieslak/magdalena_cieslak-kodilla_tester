package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> returnOrdersWithinGivenDateRange(LocalDate date_one, LocalDate date_two) {
        List<Order> filteredList;
        filteredList = this.orders.stream()
                .filter(order -> order.getDate().isAfter(date_one))
                .filter(order -> order.getDate().isBefore(date_two))
                .collect(Collectors.toList());
        return filteredList;
    }

    public List<Order> returnOrdersWithinGivenValueRange(int valueMin, int valueMax) {
        List<Order> filteredList;
        filteredList = this.orders.stream()
                .filter(order -> (order.getValue() >= valueMin))
                .filter(order -> (order.getValue() <= valueMax))
                .collect(Collectors.toList());
        return filteredList;
    }

    public int getSize() {
        return this.orders.size();
    }

    public void sumOrderValues() {
        this.orders.stream()
                .map(order -> order.getValue())
                .mapToInt(n -> n)
                .sum();
    }
}


