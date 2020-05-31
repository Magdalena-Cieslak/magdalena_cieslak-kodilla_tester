package com.kodilla.bank.homework;

public class CashMachine {

    int[] values;
    int size;

    public CashMachine() {
        this.values = new int[0];
        this.size = 0;
    }

    public void add(int value) {
        size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return this.values;
    }

    public int getNumberOfTransaction() {
        return this.size;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum = sum + this.values[i];
        }
        return sum;
    }

    public int getNumberOfPayof() {
        int payof = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0) {
                payof += this.values[i];
            }
        }
        return payof;
    }

    public int getNumberOfPayment() {
        int payment = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                payment += this.values[i];
            }
        }
        return payment;
    }

    public double getAverageOfPayof() {
        if (this.values.length == 0)
            return 0;
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0) {
                sum += this.values[i] / this.size;
            }
        }
        return sum;
    }

    public double getAverageOfPayment() {
        if (this.values.length == 0)
            return 0;
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                sum += this.values[i] / this.size;
            }
        }
        return sum;
    }
}
