package com.vehicle.model;

public class MotorCycle extends VehicleAbstract{
    //dodaj jakieś pola specyficzne dla motoru

    @Override
    public String makeNoise() {
        return "Whoom Whoom";
    }
}
