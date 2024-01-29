package com.stefancipe.dpatterns.abstractfactory;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("Shooting an arrow");
    }
}
