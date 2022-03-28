package com.syntax.Class19;

public class Horse {
    private String name;
    private int age;
    private double weight;

    Horse(String horseName, int horseAge, double horseWeight){
        name = horseName;
        age = horseAge;
        weight = horseWeight;
    }
    void printHorse(){
        System.out.println("name" + name);
    }
    void setName(String horseName){
        name=horseName;
    }
}
