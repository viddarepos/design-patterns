package com.stefancipe.dpatterns.abstractfactory;

public abstract class AbstractFactory {

    public static AbstractFactory getFactory(Class _class) {
        AbstractFactory abstractFactory = null;
        if(_class.equals(Class.KNIGHT)) {
            abstractFactory = new KnightFactory();
        } else if (_class.equals(Class.ARCHER)) {
            abstractFactory = new ArcherFactory();
        }
        return abstractFactory;
    }

    public abstract Weapon createWeapon();

    public abstract Armor createArmor();
}
