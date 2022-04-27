package com.syntax.class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap=new HashMap<>();
//fruitMap.put("Apple",20); auto casting does not work in collections and maps
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Banana",12.5); // duplicate values are overwritten
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Kiwi"));
        fruitMap.remove("Mango");
        System.out.println(fruitMap);

        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.containsValue("20.0"));
        System.out.println(fruitMap.isEmpty()); //true or false
        System.out.println(fruitMap.size());
        fruitMap.replace("Banana", 50.0);
        System.out.println(fruitMap);

    }
}
