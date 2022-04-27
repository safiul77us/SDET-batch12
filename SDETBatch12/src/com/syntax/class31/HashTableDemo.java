package com.syntax.class31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> students = new Hashtable<>();
        students.put("1", "Moreed1");
        students.put("2", "Moreed2");
        students.put("3", "Moreed3");
        students.put("4", "Moreed4");
        students.put("5", "Moreed5");

        Set<Map.Entry<String , String >> entries = students.entrySet();
        for(Map.Entry<String ,String > entry:entries){
            System.out.println(entry);
        }


//        students.put("6","Gulden");
//        students.entrySet();
//        for (Map.Entry<String, String> entry:students.entrySet()){
//            System.out.println(entry.getValue());
//        }

    }
}
