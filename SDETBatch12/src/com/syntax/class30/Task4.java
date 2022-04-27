package com.syntax.class30;


import java.util.Map;
import java.util.TreeMap;

class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name; this.lastName = lastName; this.age = age; this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Task4 {
    public static void main(String[] args) {
        TreeMap<String, Person> personTreeMap = new TreeMap<>();
        personTreeMap.put("111", new Person("Safiul", "alam", 42, 100000));
        personTreeMap.put("222", new Person("Maha", "Shah", 32, 100000));
        personTreeMap.put("333", new Person("Yasir", "Khan", 22, 100000));

        for(Map.Entry<String, Person> p: personTreeMap.entrySet()){
            System.out.println(p);
        }
    }
}
