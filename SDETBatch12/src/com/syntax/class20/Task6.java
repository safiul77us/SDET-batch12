package com.syntax.class20;

public class Task6 {
    String bookName;
    double price;

    public Task6(){
        System.out.println("No argument constructor");
    }

    public Task6(String bookName, double price) {
        this();
        this.bookName = bookName;
        this.price = price;
        System.out.println("two argument constructor");
    }
}
