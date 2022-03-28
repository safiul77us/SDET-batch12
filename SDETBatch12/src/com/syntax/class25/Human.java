package com.syntax.class25;

public interface Human {
    //public static final int legs = 2;
    int legs = 2;
    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default void noNeed(){
        System.out.println("default methods are for functional programming");
    }
}
interface LivingBeing{
    static void printLegs(){
        System.out.println("not sure");
    }
}

class Maha implements Human, LivingBeing{
    @Override
    public void walk() {
        System.out.println("I can walk");
    }

}