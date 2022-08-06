package com.company.details;

import com.company.vehicles.Car;

public class Engine {
    static int power;
    static int efficiency;


    public static int getEfficiency() {
        return efficiency;
    }

    public static int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Engine{}";
    }
}

