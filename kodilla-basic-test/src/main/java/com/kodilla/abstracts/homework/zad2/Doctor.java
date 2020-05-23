package com.kodilla.abstracts.homework.zad2;

public class Doctor extends Job {

    public Doctor(int salary) {
        super(salary);
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("The doctor treats people.");
    }

    @Override
    public void giveSalary() {
        System.out.println("Doctor salary is " + getSalary());
    }
}
