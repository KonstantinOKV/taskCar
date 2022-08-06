package com.company.vehicles;

public class Lorry extends Car {

    static int loadCapacityOfTheBody;

    public Lorry(String carBrand, String carClass, int weight) {
        super(carBrand, carClass, weight);
    }

    public static int getLoadCapacityOfTheBody() {
        return loadCapacityOfTheBody;
    }

    @Override
    public String toString() {
        return "Lorry{}";
    }
}
