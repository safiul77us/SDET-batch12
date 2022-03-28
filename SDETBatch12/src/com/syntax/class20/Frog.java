package com.syntax.class20;

import javax.jws.soap.SOAPBinding;

public class Frog {
    String name; //instance variable
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        //double weight = 20; //  local
        this.weight = weight; // instace
    }

    public Frog(String name, String color, int age,
                double weight) {
        this(name, color, age); // has to on top
//        this.name = name; // with "this", instance variable is being called
//        this.color = color;
//        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        // this() is not allowed inside methods
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}



