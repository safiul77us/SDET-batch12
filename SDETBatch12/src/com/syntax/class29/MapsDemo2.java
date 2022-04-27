package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> fruit = new HashMap<>();
        fruit.put("Orange", 10);
        fruit.put("Apple", 5);
        fruit.put("Banana", 1000);
        System.out.println(fruit);

        Map<String, Integer> vegetable = new HashMap<>();
        vegetable.put("Potato", 12);
        vegetable.put("Tomato", 15);
        vegetable.putAll(fruit);
        System.out.println(vegetable);
    }
}
