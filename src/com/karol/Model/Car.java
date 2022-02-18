package com.karol.Model;

import java.util.Objects;

public class Car extends CarAbstract implements int1, int2{

    private String make;
    private String model;
    private Integer yearOfManufacture;
    private Double engineCapacity;
    private final double price;


    public Car(double price) {
        this.price = price;
    }

    public Car(String make, String model, Integer yearOfManufacfture, Double engineCapacity, Double price) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacfture;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Integer yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacfture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(yearOfManufacture, car.yearOfManufacture) && Objects.equals(engineCapacity, car.engineCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, yearOfManufacture, engineCapacity, price);
    }

}
