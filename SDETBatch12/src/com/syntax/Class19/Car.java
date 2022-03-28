package com.syntax.Class19;

public class Car {
    String name;
    String make;
    String color= "Blue";
    String type = "Auto";

    public Car(String name, String make, String color, String type) {
        this.name = name;
        this.make = make;
        this.color = color;
        this.type = type;
    }
    Car(){
    }
    void PrintCar(){
        String name="Tesla";
        System.out.println(name);
    }
    void allInfo(){System.out.println(name+" "+make+" "+color+" "+type);}
}
