package com.vehicle.model;

public class MotorCycle extends VehicleAbstract{
    //dodaj jakieś pola specyficzne dla motoru
    //Nowy komentarz


    @Override
    public String makeNoise() {
        return "Whoom Whoom";
    }
}
