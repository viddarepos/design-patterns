package com.stefancipe.dpatterns.singleton;

public final class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void fun() {
        System.out.println("This is singleton");
    }
}
