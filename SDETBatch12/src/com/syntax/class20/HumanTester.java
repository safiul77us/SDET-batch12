package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Zuhoor";
        System.out.println(stu.name);
        stu.printName();
        stu.studentId = "123";

        Principle p = new Principle();
        p.name = "guldan";
        p.specialParkingSlot = true;
        p.printName();
    }
}
