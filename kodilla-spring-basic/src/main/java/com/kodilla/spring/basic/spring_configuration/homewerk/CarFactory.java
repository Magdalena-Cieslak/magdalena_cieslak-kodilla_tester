package com.kodilla.spring.basic.spring_configuration.homewerk;

import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CarFactory {

    @Bean
    public Car chooseCarDependingOnDate() {
        Car car;
        LocalDate localDate = LocalDate.now();

        if(localDate.isAfter(LocalDate.of(2020, 6, 20)) &&
        localDate.isBefore(LocalDate.of(2020, 9, 22))) {
            car = new Cabrio();
        } else if(localDate.isAfter(LocalDate.of(2020, 12, 21)) &&
        localDate.isBefore(localDate.of(2021, 03, 20))) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }

    public void turnOnTheLights(LocalTime localTime) {
        boolean lights;
        localTime = LocalTime.now();

        if(localTime.isAfter(LocalTime.of(20, 00)) &&
                localTime.isBefore(localTime.of(6, 00))) {
            lights = true;
        } else {
            lights = false;
        }
    }
}
