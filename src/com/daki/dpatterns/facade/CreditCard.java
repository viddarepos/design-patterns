package com.stefancipe.dpatterns.facade;

public class CreditCard {
    protected int pinCode;
    protected double balance;

    public CreditCard(int pinCode, double balance) {
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public boolean isPinCode(int pinCode) {
        return this.pinCode == pinCode;
    }
}
