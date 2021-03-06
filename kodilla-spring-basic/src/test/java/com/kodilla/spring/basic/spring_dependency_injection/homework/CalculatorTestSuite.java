package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnSum() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.add(2.0, 3.5);
        Assertions.assertEquals(5.5, value, 0.001);
    }

    @Test
    public void shouldReturnSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.subtract(4.0, 1.5);
        Assertions.assertEquals(2.5, value, 0.001);
    }

    @Test
    public void shouldReturnMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.multiply(3.0, 2.0);
        Assertions.assertEquals(6.0, value, 0.001);
    }

    @Test
    public void shouldReturnDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.divide(25.0, 5.0);
        Assertions.assertEquals(5.0, value, 0.001);
    }
}
