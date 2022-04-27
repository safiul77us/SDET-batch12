package com.syntax.class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("User is trying to use feature 1");
        System.out.println("User is trying to use feature 2");
        System.out.println(10/0);
//        int a = 10; int b = 0;
//        try {
//            System.out.println(a / b);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Error "+e.getMessage());
//        }
        System.out.println("User is trying to use feature 3");
    }
}
