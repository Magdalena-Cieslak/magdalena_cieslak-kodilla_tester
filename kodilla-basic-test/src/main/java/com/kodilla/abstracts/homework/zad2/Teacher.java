package com.kodilla.abstracts.homework.zad2;

public class Teacher extends Job {

    public Teacher(int salary) {
        super(salary);
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("The teacher teaches others.");
    }

    @Override
    public void giveSalary() {
        System.out.println("Teacher salary is " + getSalary());
    }

}
