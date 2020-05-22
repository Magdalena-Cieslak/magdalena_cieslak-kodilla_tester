package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public void turnOn() {
        System.out.println("System is turning on.");
    }

    public void turnOf() {
        System.out.println("System is turning of.");
    }

    public OperatingSystem(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayYearOfPublishment() {
        System.out.println("The year of publishment is:" + year);
    }
}
