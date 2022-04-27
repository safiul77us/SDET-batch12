package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        System.out.println(fruitMap);

       Iterator<String> iterator =  fruitMap.keySet().iterator();
       while (iterator.hasNext()){
           String key = iterator.next();
           Double value = fruitMap.get(key); // get() method is used to get values from the key
           if(key.contains("e") && value >=20){
               iterator.remove();
           }
       }
        System.out.println(fruitMap);
    }
}
