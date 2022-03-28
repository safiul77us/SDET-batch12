package com.syntax.class21;

class Child extends Parent {
    String color = "Red";

    void printColor() {
        String color = "Green";
        System.out.println(color);    // refers to local variable
        System.out.println(this.color); // refers to current instance variable
        System.out.println(super.color); // refers to parent variable
    }
}
