package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        System.out.println(names.get(0));

        HashMap<Integer, String > map = new HashMap<>();
        map.put(1, "asghar");
        map.put(2, "mo");
        System.out.println(map.get(1));

        HashMap<String, String> groceris = new HashMap<>();
        groceris.put("lilly", "Eggs, doll, cow");
        groceris.put("Maha", "Choco");
        groceris.put("Ashgar", "Suger");
        System.out.println(groceris.get("lilly"));
    }
}
