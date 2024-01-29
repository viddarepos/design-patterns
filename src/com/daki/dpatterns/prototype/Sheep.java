package com.stefancipe.dpatterns.prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is constructed");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is cloned");

        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheep;
    }
}
