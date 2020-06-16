package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("one"));
        warehouse.addOrder(new Order("two"));
        warehouse.addOrder(new Order("three"));
        warehouse.addOrder(new Order("four"));

    }
}

