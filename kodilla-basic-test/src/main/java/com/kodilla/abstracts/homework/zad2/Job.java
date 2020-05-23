package com.kodilla.abstracts.homework.zad2;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void giveResponsibilities();
    public abstract void giveSalary();

}
