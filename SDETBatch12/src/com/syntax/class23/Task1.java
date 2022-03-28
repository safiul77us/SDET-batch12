package com.syntax.class23;

public class Task1 {
}

class Programming{

    Programming(){
        System.out.println("I love programming language");
    }
    Programming(String str){
        System.out.println("I love you");
    }

    public static void main(String[] args) {
        //Programming p = new Programming();
        new Programming();
        new Programming("Java");
    }

}
