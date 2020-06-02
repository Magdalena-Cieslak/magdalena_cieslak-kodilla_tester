package com.kodilla.collections.arraays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) +1];
        for(int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for(Car car : cars)
            CarUtils.describeCar(car);
    }


    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int carSpeed = random.nextInt();

        if (drawnCarKind == 0)
            return new Opel(carSpeed);
        else if (drawnCarKind == 1)
            return new Ford(carSpeed);
        else
            return new Toyota(carSpeed);
    }
}
