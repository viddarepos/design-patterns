package com.stefancipe.dpatterns.factory;

public class CarFactory {

    public Car makeCar(String motor) {
        if(motor.contentEquals("Electric")) return new ElectricMotorCar();
        return new DieselMotorCar();
    }
}
