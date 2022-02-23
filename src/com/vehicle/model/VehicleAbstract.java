package com.vehicle.model;

import java.util.Objects;

public abstract class VehicleAbstract {

    private String make;
    private String model;
    private Integer yearOfManufacture;
    private Integer numberOfWheels;
    private Double engineCapacity;
    private Double price;

    public VehicleAbstract(String make, String model, Integer yearOfManufacture, Integer numberOfWheels, Double engineCapacity, Double price) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.numberOfWheels = numberOfWheels;
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

    abstract String makeNoise();

    public VehicleAbstract() {
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleAbstract that = (VehicleAbstract) o;
        return Objects.equals(make, that.make) && Objects.equals(model, that.model) && Objects.equals(yearOfManufacture, that.yearOfManufacture) && Objects.equals(numberOfWheels, that.numberOfWheels) && Objects.equals(engineCapacity, that.engineCapacity) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, yearOfManufacture, numberOfWheels, engineCapacity, price);
    }

    @Override
    public String toString() {
        return "VehicleAbstract{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", numberOfWheels=" + numberOfWheels +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                '}';
    }
}
