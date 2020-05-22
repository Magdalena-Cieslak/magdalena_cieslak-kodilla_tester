package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public void startTheGame() {
        System.out.println("The game is starting.");
    }

    public void finishTheGame() {
        System.out.println("The game is finishing.");
    }

    public void turnOn() {
        System.out.println("System is turning on.");
    }

    public Windows(int year) {
        super(year);
    }
}
