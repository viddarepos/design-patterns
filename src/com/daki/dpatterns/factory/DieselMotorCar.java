package com.stefancipe.dpatterns.factory;

public class DieselMotorCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a diesel motor car");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting a diesel motor car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping a diesel motor car");
    }
}
