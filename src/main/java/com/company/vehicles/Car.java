package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    static String carBrand;
    static String carClass;
    static int weight;

    static int motor = Engine.getPower();
    static int motor1 = Engine.getEfficiency();
    static String driver = Driver.getFullName();
    static int driver1 = Driver.getDrivingExperience();
    public Car(String carBrand, String carClass, int weight) {
        Car.carBrand = carBrand;
        Car.carClass = carClass;
        Car.weight = weight;
    }
    public static void start(){
        System.out.println("Поехали");
    }
    public static void stop()
    {
        System.out.println("Останавливаемся");
    }
    public static void turnRight(){
        System.out.println("Поворачиваем направо");
    }
    public static void turnLeft(){
        System.out.println("Поворачиваем налево");
    }
    public static void main(String[] args) {
        start();
        stop();
        turnRight();
        turnLeft();
    }
    public String toString(){
        System.out.println("Car brand " + carBrand + ", car class" + carClass + ", weight" + weight + "info car of driver:" + motor + ", " + motor1 + ", " + driver + ", " + driver1);
        return toString();
    }


}
