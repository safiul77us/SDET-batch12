package com.syntax.class17;

public class Student {

    String name;
    String id;
    static int numberOfStudents;


    public static void main(String[] args) {
        Student s = new Student();
        s.name = "yazgul";
        s.id = "123";
        Student.numberOfStudents++;

        Student s1 = new Student();
        s1.name = "yazg";
        s1.id = "127";
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);


    }
}


