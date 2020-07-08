package com.kodilla.spring.basic.spring_configuration.homewerk;

public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(boolean lights) {
        if (lights) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
