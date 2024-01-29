package com.stefancipe.dpatterns.abstractfactory;

public class KnightFactory extends AbstractFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }
}
