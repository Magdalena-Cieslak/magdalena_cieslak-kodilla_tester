package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("one"));
        warehouse.addOrder(new Order("two"));
        warehouse.addOrder(new Order("three"));
        warehouse.addOrder(new Order("four"));

        try {
            Order orderNumberSix = warehouse.getOrder("six");
            System.out.println("Order: " + orderNumberSix);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order does not exist");
        }
    }
}


