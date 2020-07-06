package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class DisplayTestSuite {

    @Test
    public void shouldDisplayValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.basic");
        Display bean = context.getBean(Display.class);
        Double value = bean.display(4.0);
        Assertions.assertNotNull(value);
    }
}
