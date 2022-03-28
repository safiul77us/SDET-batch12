package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        List<String> course = new LinkedList<>();
        course.add("SDLC");
        course.add("Manual Testing");
        course.add("Java");
        course.add("Git");
        course.add("Selenium");

       Iterator<String> iterator = course.iterator();
//        System.out.println(iterator.next());

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

