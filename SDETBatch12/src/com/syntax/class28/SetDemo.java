package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Mange");
        fruit.add("Kiwi");
        fruit.add("Apple");
        System.out.println(fruit);

        LinkedHashSet<String > fruit2 = new LinkedHashSet<>();
        fruit2.add("Apple");
        fruit2.add("Mange");
        fruit2.add("Kiwi");
        fruit2.add("Apple");
        System.out.println(fruit2);

        TreeSet<String> fruit3 = new TreeSet<>();
        fruit3.add("Z");
        fruit3.add("a");
        fruit3.add("f");
        fruit3.add("c");
        System.out.println(fruit3);
    }
}
