package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("soap");
        fruits.add("pillow");
        fruits.add("Milk");


        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Poato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList <String> groceris = new ArrayList<>();
        groceris.addAll(fruits);
        groceris.addAll(vegetables);
        System.out.println(groceris);




    }
}
