package com.vehicle.service;

import com.vehicle.model.MotorCycle;

import java.util.ArrayList;
import java.util.List;

public class MotocycleCreator {

    //zaimplementuj podobnie jak CarsCreator
    public MotorCycle createMotorCycle(String make, String model, Integer yearOfManufacture, Integer numberOfWheels, Double engineCapacity, Double price, Integer maxPassenger){
           MotorCycle created = new MotorCycle(make, model, yearOfManufacture, numberOfWheels, engineCapacity, price, maxPassenger);
           return created;
    }

    public List<MotorCycle> returnListOfMotorcycles(){

    List<MotorCycle> motorcyclesList = new ArrayList<>();

    MotorCycle suzuki = new MotorCycle(make suzuki)
}
