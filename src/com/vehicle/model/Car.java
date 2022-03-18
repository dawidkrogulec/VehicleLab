package com.vehicle.model;

public class Car extends VehicleAbstract implements CarsInterface, VehicleInterface {

    //dodaj jakies pola specyficzne dla samochodu
    private Boolean doorOpen;


    public Car(String make, String model, Integer yearOfManufacture, Integer numberOfWheels, Double engineCapacity, Double price, Boolean doorOpen) {
        super(make, model, yearOfManufacture, numberOfWheels, engineCapacity, price);
        this.doorOpen = doorOpen;
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
    public Boolean closeDoor() {

        if (doorOpen == true){
            doorOpen = false;
        }

        return doorOpen;
    }

    @Override
    public Boolean openDoor() {

        if (doorOpen == false){
            doorOpen = true;

        }
        return doorOpen;
    }

    @Override
    public String turnOnEngine() {
        return "Engine is running";
    }

    public Boolean getDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(Boolean doorOpen) {
        this.doorOpen = doorOpen;
    }
}