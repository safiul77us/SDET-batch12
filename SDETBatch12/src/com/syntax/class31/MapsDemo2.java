package com.syntax.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        ArrayList<String > vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("carrot");
        vegetables.add("Onion");

        ArrayList<String > fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        Map<String, ArrayList> healthyFoods = new HashMap<>();
        healthyFoods.put("Vegetables ", vegetables);
        healthyFoods.put("Fruits ", fruits);

        System.out.println(healthyFoods);
    }
}
