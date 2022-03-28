package com.syntax.class21;

public class Father {
    String name="Parent - super"; // super
    void printName(){
        System.out.println(name);
    }
}

class Child1 extends Father{
    String name="Child1 - instance";   // this

    void printName(){
        String name="Teyfur";

        System.out.println("My name is " + name); // local
        System.out.println(this.name); // instance
        System.out.println(super.name); //
    }
}

class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();
    }
}