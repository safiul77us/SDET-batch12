package com.syntax.class30;

import java.util.HashMap;

public class Task1 {
    /*
    Create a map of a buildings. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..).
    Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */


    public static void main(String[] args) {
        //HashMap, LinkedHashMap, TreeMap
        HashMap< Integer, String> buildings = new HashMap<>();
        buildings.put(1, "Google");
        buildings.put(2, "Syntax");
        buildings.put(3, "Zoom");
        buildings.put(1, "IRS");
        buildings.put(5, "DMV");
        buildings.put(6, "Zoom");
        buildings.put(7, "Zoom");

        System.out.println(buildings);
        System.out.println("Number of floors"+ buildings.size());
        buildings.replace(4, "Yahoo");
        buildings.remove(7);
        System.out.println(buildings);
    }


}
