package com.syntax.class23;

public class AlisParent {

    String girlName = "salma";
    double money = 1000000;
    void marry(){
        System.out.println("Ali you sould marry "+ girlName);
    }
}

class Ali extends AlisParent{
    //String girlName = "Rihann";
    void marry(){
        //super.marry();
        System.out.println("But i want to marry "+ girlName);
    }
}
