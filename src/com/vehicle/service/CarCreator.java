package com.vehicle.service;

import com.vehicle.model.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarCreator {

    public Car createCar(String make, String model, Integer year, Integer numberOfWheels, Double engine, Double price, Boolean doorOpen) {
        Car created = new Car(make, model, year, numberOfWheels, engine, price, doorOpen);
        return created;
    }

    public List<Car> returnListOfCars() {

        List<Car> carsList = new ArrayList<>();

        Car audi = new Car("Audi", "A3", 2022, 4, 1.5,300.74, false);
        Car audi1 = new Car("Audi", "A3", 2022, 4, 1.5,  300.74, false);
        Car audi2 = new Car("Audi", "A3", 2022, 4, 1.5, 300.74, false);
        Car audi3 = new Car("Audi", "A3", 2022, 4, 1.5, 300.74, false);

        carsList.add(audi);
        carsList.add(audi1);
        carsList.add(audi2);
        carsList.add(audi3);

        return carsList;
    }

    public Set<Car> returnSetOfCars(){

        Set<Car> carSet = new HashSet<>();


        Car audi = new Car("Audi", "A3", 2022, 4, 1.5, 300.73, false);
        Car audi1 = new Car("Audi", "A3", 2022, 4, 1.5, 300.73, false);
        Car audi2 = new Car("Audi", "A3", 2022, 4, 1.5, 300.73, false);
        Car audi3 = new Car("Audi", "A3", 2022, 4, 1.5, 300.73, false);

        carSet.add(audi);
        carSet.add(audi1);
        carSet.add(audi2);
        carSet.add(audi3);

        return carSet;
    }

}
