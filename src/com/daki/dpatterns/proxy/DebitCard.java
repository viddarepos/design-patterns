package com.stefancipe.dpatterns.proxy;

public class DebitCard {
    double balance;
    public DebitCard() {
        balance = 200;
    }

    public void payOnRegister(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void makeDeposit(double amount) {
        this.balance += amount;
    }
}
