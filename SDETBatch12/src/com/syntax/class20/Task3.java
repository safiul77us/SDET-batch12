package com.syntax.class20;

public class Task3 {
    private Task3 (int a) {
        System.out.println("private");
    }
    Task3(double a) {
        System.out.println("Default");
    }
    protected Task3(String a) {
        System.out.println("protected");
    }
    public Task3(boolean a) {
        System.out.println("public");
    }
    public static void main(String[]args){
        new Task3(10);
        new Task3("haah");
        new Task3(10.2);
        new Task3(false);
    }
}
