package com.vehicle.model;

public class MotorCycle extends VehicleAbstract{

    private final Integer maxPassenger;
    private Boolean isCross;

    public MotorCycle(String make, String model, Integer yearOfManufacture, Integer numberOfWheels, Double engineCapacity, Double price, Integer maxPassenger, Boolean isCross) {
        super(make, model, yearOfManufacture, numberOfWheels, engineCapacity, price);
        this.maxPassenger = maxPassenger;
        this.isCross = isCross;
    }

    public MotorCycle(String make, String model, Integer yearOfManufacture, Integer numberOfWheels, Double engineCapacity, Double price, Integer maxPassenger) {
        super(make, model, yearOfManufacture, numberOfWheels, engineCapacity, price);
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String makeNoise() {
        return "Whoom Whoom";
    }

    public Integer getMaxPassenger() {
        return maxPassenger;
    }

    public Boolean getCross() {
        return isCross;
    }

    public void setCross(Boolean cross) {
        isCross = cross;
    }
}
