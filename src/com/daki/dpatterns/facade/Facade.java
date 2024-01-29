package com.stefancipe.dpatterns.facade;

public class Facade {
    private CreditCard creditCard;
    private Profile profile;

    public Facade(CreditCard creditCard, Profile profile) {
        this.creditCard = creditCard;
        this.profile = profile;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public double withdrawMoney(double amount, int pin) {
        if(creditCard.isPinCode(pin) && creditCard.getBalance() > amount) {
            creditCard.setBalance(creditCard.getBalance() - amount);
        }
        return amount;
    }

    public void depositMoney(double amount, int pin) {
        if(creditCard.isPinCode(pin))
            creditCard.setBalance(creditCard.getBalance() + amount);
    }

    public void orderItem(double amount, int pin) {
        if (withdrawMoney(amount,pin) == amount) {
            System.out.println(profile.getEmail() + " just ordered item for $" + amount + "\nShippment address: " + profile.getAddress() );
        }
    }

}
