package com.company.professions;

import com.company.vehicles.Car;

public class Driver {
    static String fullName;
    static int drivingExperience;

    public static String getFullName() {
        return fullName;
    }

    public static int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{}";
    }
}
