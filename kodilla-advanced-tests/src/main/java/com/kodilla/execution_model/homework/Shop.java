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
        List<Order> ordersList = new ArrayList<>();
        filteredList = ordersList.stream()
                .map(order -> order.getDate())
                .filter(date -> date.isAfter(date_one))
                .filter(date -> date.isBefore(date_two))
                .map()    //nie wiem jakie działanie tu zrobić, żeby z przefiltrowanych dat wrócić do zamówień z tych dat
                .collect(Collectors.toList());
        return filteredList;
    }

    public void getOrder(int valueMin, int valueMax) {
        //List<Order> filteredList;
        List<Order> orders = new ArrayList<>();
        orders.stream()
                .map(order -> order.getValue())
                .filter(order -> (order >= valueMin))
                .filter(order -> (order <= valueMax))
                .collect(Collectors.toList());
    }

    public int getSize() {
        return this.orders.size();
    }

    public void sumOrderValues() {
        List<Order> orders = new ArrayList<>();
        orders.stream()
                .map(order -> order.getValue())
                .mapToInt(n -> n)
                .sum();
    }
}


