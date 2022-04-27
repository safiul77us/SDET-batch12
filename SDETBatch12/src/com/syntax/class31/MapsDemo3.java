package com.syntax.class31;

import org.bouncycastle.jcajce.provider.digest.MD2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo3 {
    public static void main(String[] args) {
HashMap<String , Double> fruit = new HashMap<>();
fruit.put("Apple", 10.0);
fruit.put("Orange", 20.0);

HashMap<String , Double> vegetables = new HashMap<>();
vegetables.put("onion", 12.5);
vegetables.put("carrot", 15.5);

ArrayList<HashMap<String , Double >> list = new ArrayList<>();
list.add(fruit);
list.add(vegetables);
System.out.println(list);

    }
}
