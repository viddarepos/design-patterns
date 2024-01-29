package com.stefancipe.dpatterns.proxy;

public class Proxy {
    DebitCard debitCard;

    public Proxy() {
        debitCard = new DebitCard();
    }

    public boolean payOnRegister(double amount) {
        if(debitCard.getBalance() > amount) {
            debitCard.payOnRegister(amount);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return debitCard.getBalance();
    }

    public void makeDeposit(double amount) {
        debitCard.makeDeposit(amount);
    }
}
