package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.homewerk.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldChooseCarDependingOnDate() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCarDependingOnDate");
        //When
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> possibleCars = Arrays.asList("Cabrio", "SUV", "Sedan");
        Assertions.assertTrue(possibleCars.contains(type));
    }
}
