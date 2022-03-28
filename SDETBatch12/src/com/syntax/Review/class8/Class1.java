package com.syntax.Review.class8;

public class Class1 {
    public void printSmallDigit(int x, int y){
        if(x<y){
            System.out.println(x + " is smaller");
        }else if(y<x){
            System.out.println(y+ " is smaller");
        }else {
            System.out.println("Both values are same");
        }
    }

    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.printSmallDigit(3, 5);
        obj.printSmallDigit(10,2);
    }
}
