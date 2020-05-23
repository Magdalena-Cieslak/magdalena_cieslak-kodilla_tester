package com.kodilla.abstracts.homework.zad2;

import java.awt.print.Pageable;

public class Person {
    String firstName;
    int age;
    String job;

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1000);
        teacher.giveResponsibilities();
        teacher.giveSalary();

        Doctor doctor = new Doctor(1500);
        doctor.giveResponsibilities();
        doctor.giveSalary();

        Driver driver = new Driver(2000);
        driver.giveResponsibilities();
        driver.giveSalary();

    }
}


