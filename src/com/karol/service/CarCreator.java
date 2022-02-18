package com.karol.service;

import com.karol.Model.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarCreator {

    public Car createCar(String make, String model, Integer year, Double engine, Double price) {
        Car created = new Car(make, model, year, engine, price);
        return created;
    }

    public List<Car> returnListOfCars() {

        List<Car> carsList = new ArrayList<>();

        Car blank = new Car(200.55);
        Car audi = new Car("Audi", "A3", 2022, 1.5, 300.74);
        Car audi1 = new Car("Audi", "A3", 2022, 1.5, 300.74);
        Car audi2 = new Car("Audi", "A3", 2022, 1.5, 300.74);
        Car audi3 = new Car("Audi", "A3", 2022, 1.5, 300.74);


        carsList.add(blank);
        carsList.add(audi);
        carsList.add(audi1);
        carsList.add(audi2);
        carsList.add(audi3);

        return carsList;
    }

    public Set<Car> returnSetOfCars(){

        Set<Car> carSet = new HashSet<>();

        Car blank = new Car(200.50);
        Car audi = new Car("Audi", "A3", 2022, 1.5, 300.73);
        Car audi1 = new Car("Audi", "A3", 2022, 1.5, 300.73);
        Car audi2 = new Car("Audi", "A3", 2022, 1.5, 300.73);
        Car audi3 = new Car("Audi", "A3", 2022, 1.5, 300.73);

        carSet.add(blank);
        carSet.add(audi);
        carSet.add(audi1);
        carSet.add(audi2);
        carSet.add(audi3);

        return carSet;
    }

}
