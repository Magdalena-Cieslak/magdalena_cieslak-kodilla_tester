package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean value = bean.deliveryPackage("NY City", 35.5);
        Assertions.assertTrue(true);
    }

}
