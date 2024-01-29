package com.stefancipe.dpatterns.abstractfactory;

public class ArcherFactory extends AbstractFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new LightArmor();
    }
}
