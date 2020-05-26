package com.kodilla.inheritance;

public class Convertible extends Car {

    public void openRoof() {
        System.out.println("Opening roof..");
    }

    public void closeRoof() {
        System.out.println("Closing roof..");
    }

    public void openDoors() {
        System.out.println("Opening 2 doors");
    }

    public Convertible(int wheals, int seats) {
        super(wheals, seats);
    }

}
