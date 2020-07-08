package com.kodilla.spring.basic.spring_scope.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    public LocalTime currentTime() {
        LocalTime time = LocalTime.now();
        System.out.println("the current time is " + time);
        return time;
    }
}
