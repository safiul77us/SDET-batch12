package com.syntax.class27;

import java.util.ArrayList;

/*
Create an ArrayList that will store 5 names into it.

Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
public class ArrayListAssigment {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Bella");
        names.add("Charlie");
        names.add("Donald");
        names.add("Enam");

        String nameCheck = "enam";
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.contains(nameCheck));



    }
}
