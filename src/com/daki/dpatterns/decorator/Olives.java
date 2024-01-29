package com.stefancipe.dpatterns.decorator;

public class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        super(pizza);
        System.out.println("Adding olives");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + .20;
    }
}
