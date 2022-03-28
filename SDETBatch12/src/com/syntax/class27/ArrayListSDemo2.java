package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListSDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> num = new ArrayList<>();
        num.add(10.5);
        num.add(100.5);
        num.add(12.5);
        System.out.println(num.toString());


        for (Double d : num){
            System.out.println(num);
        }

    }


}
