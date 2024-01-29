package com.stefancipe.dpatterns.factory;

public class ElectricMotorCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an electric motor car");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting an electric motor car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping an electric motor car");
    }
}
