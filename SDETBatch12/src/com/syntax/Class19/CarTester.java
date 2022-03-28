package com.syntax.Class19;

import org.checkerframework.checker.units.qual.C;

public class CarTester {
    public static void main(String[] args) {
        Car c = new Car();
        c.PrintCar();


        Car car = new Car("To", "2000", "Blue", "Auty");
        car.allInfo();

    }
}
