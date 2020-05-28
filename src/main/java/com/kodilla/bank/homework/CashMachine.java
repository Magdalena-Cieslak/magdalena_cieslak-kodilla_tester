package com.kodilla.bank.homework;

public class CashMachine {

    int[] values;
    int size;

    public CashMachine() {
        this.values = new int[0];
        this.size = size;
    }

    public void add(int value) {
        size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size -1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
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

}
