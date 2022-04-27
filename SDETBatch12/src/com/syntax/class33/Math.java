package com.syntax.class33;

public class Math {
    void add(int a, int b) {System.out.println(a + b);}
    void divide(int a, int b) {

        try{
            System.out.println(a / b);
        }catch (ArithmeticException are){
            System.out.println("you are dividing by zero " + are.getMessage());
        }catch (NullPointerException n){
            System.out.println("Because it is null, write something in it.");
        }
//        if(b!=0){
//            System.out.println(a / b);
//        }else {
//            System.out.println("can't be divide by zero");
//        }
    }
}

class Calculator {
    void DoTheMath(int a, int b) {
        Math math = new Math();
        math.add(a, b);
        math.divide(a, b);
    }
}

class DoSomething {
    void doSomething(int a, int b) {
        Calculator calculator = new Calculator();
        calculator.DoTheMath(a, b);
    }
    public static void main(String[] args) {
        DoSomething doSomething = new DoSomething();
        doSomething.doSomething(10, 0);
    }
}

