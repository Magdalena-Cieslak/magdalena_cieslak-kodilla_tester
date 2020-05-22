package com.kodilla.inheritance.homework;

public class RunSystem {
    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(2005);
        system.turnOn();

        Windows windows = new Windows(2000);
        system.displayYearOfPublishment();
    }

}
