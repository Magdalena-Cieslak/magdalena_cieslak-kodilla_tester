package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arraays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();

        cars.add(new Ford(110));
        cars.add(new Ford(90));
        cars.add(new Ford(150));

        for(Ford ford : cars) {
            System.out.println(CarUtils.describeCar(Car cars));
        }

        cars.remove(1);
        Ford ford = new Ford(110);
        cars.remove(ford);

        System.out.println(CarUtils.describeCar(Car cars) + "Liczba elementów w kolekcji: " +
                cars.size());

    }
}
