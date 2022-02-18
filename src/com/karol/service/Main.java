package com.karol.service;

import com.karol.Model.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    List<Car> carsList = new ArrayList<>();
    Set<Car> carSet = new HashSet<>();

    public static void main(String[] args) {

        Main main = new Main();
        CarCreator carCreator = new CarCreator();

        main.carsList.addAll(carCreator.returnListOfCars());
        main.carsList.add(carCreator.createCar("Skoda", "Fabia", 2019, 1.2, 321.33));

        main.carSet.addAll(carCreator.returnSetOfCars());
        main.carSet.add(carCreator.createCar("Skoda", "Fabia", 2019, 1.2, 321.33));

        System.out.println("");
        System.out.println("Cars List");
        System.out.println("");

        for (int i = 0; i <= main.carsList.size()-1; i++){
            System.out.println(main.carsList.get(i).toString());
        }
        System.out.println("");
        System.out.println("Cars Set");
        System.out.println("");

        for (Car cars : main.carSet){
            System.out.println(cars.toString());
        }

    }
}
