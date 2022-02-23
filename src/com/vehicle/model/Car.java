package com.vehicle.model;

public class Car extends VehicleAbstract implements CarsInterface, VehicleInterface {

    //dodaj jakies pola specyficzne dla samochodu

    public Car(String make, String model, Integer yearOfManufacture, Integer numberOfWheels, Double engineCapacity, Double price) {
        super(make, model, yearOfManufacture, numberOfWheels, engineCapacity, price);
    }

    @Override
    public String makeNoise() {
        return "Brum Brum";
    }

    @Override
    public String openTrunk() {
        return "trunk opened";
    }

    @Override
    public String turnOnEngine() {
        return "Engine is running";
    }
}
