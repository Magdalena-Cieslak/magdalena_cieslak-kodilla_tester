package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    int size;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.size=0;
    }

    public void add(CashMachine cashMachine) {
        size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int getTotalBalance() {
        return cashMachines[0].getBalance();
    }

    public int getTotalNumberOfPayof() {
        return cashMachines[0].getNumberOfPayof();
    }

    public int getTotalNumberOfPayment() {
        return cashMachines[0].getNumberOfPayment();
    }

    public double getTotalAverageOfPayof() {
        return cashMachines[0].getAverageOfPayof();
    }

    public double getTotalAverageOfPayment() {
        return cashMachines[0].getAverageOfPayment();
    }
}




