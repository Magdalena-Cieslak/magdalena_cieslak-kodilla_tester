package com.kodilla.abstracts.homework.zad2;

public class Driver extends Job {

    public Driver(int salary) {
        super(salary);
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("The driver drives a car");
    }

    @Override
    public void giveSalary() {
        System.out.println("The driver salary is " + getSalary());
    }


}
