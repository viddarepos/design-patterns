package com.stefancipe.dpatterns.decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding mozzarella");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}
