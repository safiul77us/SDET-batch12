package com.syntax.class20;

public class Task8 {
    /*
    Write program to inherit class A that has method printF which is
    static and call or reuse that method into class B
     */
    public static void main(String[] args) {
        BB.printF();
    }
}

class AA{
    static void printF(){
        System.out.println("batch 12 wil be making memes on jobs");
    }
}
class BB extends AA{
}