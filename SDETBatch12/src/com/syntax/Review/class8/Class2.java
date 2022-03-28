package com.syntax.Review.class8;

public class Class2 {
    String generateUsername(String fName, String lName){
        return fName+"123"+lName+".com";
    }
    static void myDemand(){
        System.out.println("This is my demand");
    }

    public static void main(String[] args) {
        Class2 obj = new Class2();
        System.out.println(obj.generateUsername("gulnar", "emilia"));

        myDemand();



    }
}

