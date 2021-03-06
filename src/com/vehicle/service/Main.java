package com.vehicle.service;

import com.vehicle.model.Car;
import com.vehicle.model.MotorCycle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    //powtórz to samo dla motorów
    List<MotorCycle> motorCycleList = new ArrayList<>();
    Set<MotorCycle> Set = new HashSet<>();

    List<Car> carsList = new ArrayList<>();
    Set<Car> carSet = new HashSet<>();

    public static void main(String[] args) {

        Main main = new Main();
        CarCreator carCreator = new CarCreator();

        main.carsList.addAll(carCreator.returnListOfCars());
        main.carsList.add(carCreator.createCar("Skoda", "Fabia", 2019, 4, 1.2, 321.33, false));
        main.carsList.get(0).openDoor();

        main.carSet.addAll(carCreator.returnSetOfCars());
        main.carSet.add(carCreator.createCar("Skoda", "Fabia", 2019, 4, 1.2, 321.33, false));

        System.out.println("");
        System.out.println("Cars List");
        System.out.println("");

        for (int i = 0; i <= main.carsList.size()-1; i++){
            System.out.println(main.carsList.get(i).toString());
            System.out.println(main.carsList.get(i).makeNoise());
            System.out.println(main.carsList.get(i).getDoorOpen());
            System.out.println("Door open " + main.carsList.get(i).getDoorOpen());
            // todo - implement error handling
            // System.out.println(main.carsList.get(8).toString());
        }
        System.out.println("");
        System.out.println("Cars Set");
        System.out.println("");

        for (Car car : main.carSet){
            System.out.println(car.toString());
            System.out.println(car.makeNoise());
        }
    }
}
