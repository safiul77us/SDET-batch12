package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Balkan");
        cities.add("Tokyo");
        cities.add("Ankara");
        cities.add("Kiev");
        cities.add("Bombay");
        cities.add("Mary");
        cities.add("Arlington");
        cities.add("Athens");
        System.out.println(cities);

        // Then remove any city that starts with "A";
        Iterator<String > iterator =  cities.iterator();
//        while (iterator.hasNext()) {
//            if(iterator.next().startsWith("A")){
//                iterator.remove();
//            }
//        }
//        System.out.println(cities);

        cities.removeIf(s -> s.toLowerCase().startsWith("a"));
        System.out.println(cities);

    }
}
