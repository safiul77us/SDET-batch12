//package com.syntax.RapleSolution;
//
//public class Reple143 {
//}
//class Car{
//    String make;
//    String model;
//    int numberOfDoors;
//    int topSpeed;
//    double price;
//    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
//        this.make = make;
//        this.model = model;
//        this.numberOfDoors = numberOfDoors;
//        this.topSpeed = topSpeed;
//        this.price = price;
//    }
//    //2
//    public Car(String make, String model, int topSpeed, double price) {
//        this.make = make;
//        this.model = model;
//        this.numberOfDoors = 4;
//        this.topSpeed = topSpeed;
//        this.price = price;
//    }
//    //3
//    public Car(int numberOfDoors, int topSpeed, double price) {
//        this.make = "unknown";
//        this.model = "unknown";
//        this.numberOfDoors = numberOfDoors;
//        this.topSpeed = topSpeed;
//        this.price = price;
//    }
//    //4
//    public Car(String make, String model, int numberOfDoors) {
//        this.make = make;
//        this.model = model;
//        this.numberOfDoors = numberOfDoors;
//        this.topSpeed = 90;
//        this.price = 0;
//    }
//    void display(){
//        System.out.println(make+" "+ model+" "+numberOfDoors + " "+topSpeed+" "+price);
//    }
//}
// class Main {
//    public static void main(String[] args) {
//        Car car1 = new Car("Toyota", "Prius", 4, 120, 30000 );
//        car1.display();
//        Car car2 = new Car("Toyota", "Prius", 120, 30000);
//        car2.display();
//        Car car3 = new Car(4, 120, 30000);
//        car3.display();
//        Car car4 = new Car("Toyota", "Prius", 30000);
//        car4.display();
//    }
//}
