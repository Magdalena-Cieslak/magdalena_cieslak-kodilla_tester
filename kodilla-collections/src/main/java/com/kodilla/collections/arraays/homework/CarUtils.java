package com.kodilla.collections.arraays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("---------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed is: " + car.getSpeed());

    }

    private static String getCarName(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car name";

    }

}

