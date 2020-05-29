package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(70);
        doRace(ford);

        Opel opel = new Opel(90);
        doRace(opel);

        Toyota toyota = new Toyota(120);
        doRace(toyota);
    }

    private static void doRace(Car car) {
        car.decreaseSpeed(); car.decreaseSpeed();
        car.increaseSpeed(); car.increaseSpeed(); car.increaseSpeed();
        System.out.println(car.getSpeed());

    }

}
