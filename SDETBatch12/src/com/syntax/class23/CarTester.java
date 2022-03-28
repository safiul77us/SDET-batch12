package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();

        Tesla tesla = new Tesla();
        tesla.stop();

        Car car = new Tesla(); // polymorphism
        car.start();
    }
}
