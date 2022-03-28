package com.syntax.class23;

public class StaticDemo {

}

class Cat{
    static int noOfLegs = 4;
    String name;

    public void printInfo(){
        System.out.println(name+noOfLegs);
    }
    public static void print(){
        // we can't access the instance field directly inside static methods
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.printInfo();

    }

}
