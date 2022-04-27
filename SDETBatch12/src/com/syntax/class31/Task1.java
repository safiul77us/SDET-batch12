package com.syntax.class31;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    //Create a Map that will store Employee name and salary. Write a logic to retrieve
// an employee who gets the highest salary. Output should be in the below format:
//John Smith=$100000

    public static void main(String[] args) {
HashMap<String, Integer> employee = new HashMap<>();
employee.put("Samina", 110000);
employee.put("Hamina", 120000);
employee.put("Mujib", 130000);

String name = null;
Integer salary= 0;
for(Map.Entry<String , Integer> entry:employee.entrySet()){
    if (entry.getValue()>salary){
        salary = entry.getValue();
        name = entry.getKey();
    }
}
System.out.println(name+ " =$ "+ salary);

//        double maxValue = (Collections.max(employee.values()));
//        for(Map.Entry<String,Integer> entry:employee.entrySet()){
//            if(entry.getValue()==maxValue){
//                System.out.println(entry);
//            }
//        }

    }
}
