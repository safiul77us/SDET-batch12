package com.syntax.class20;

public class Lion extends Animal{
    boolean huntOther = true;
    void roar(){
        System.out.println(name + " is roaring");
    }
    void hunt(){
        System.out.println("Does it hunt? " +huntOther);
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        l.name = "Alex";
        l.sleep();
        l.roar();
        l.hunt();
    }
}
