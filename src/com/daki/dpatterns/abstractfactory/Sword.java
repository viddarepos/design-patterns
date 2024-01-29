package com.stefancipe.dpatterns.abstractfactory;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("Swinging the blade");
    }
}
