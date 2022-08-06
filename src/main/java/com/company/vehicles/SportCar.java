package com.company.vehicles;

public class SportCar extends Car {

    public static int getSpeedLimit() {
        return speedLimit;
    }

    static int speedLimit;
    public SportCar(String carBrand, String carClass, int weight) {
        super(carBrand, carClass, weight);
    }

    @Override
    public String toString() {
        return "SportCar{}";
    }
}
