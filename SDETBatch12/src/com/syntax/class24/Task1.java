package com.syntax.class24;

public class Task1 {
}

class Student{
    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Do homework");
    }
    void practice(){
        System.out.println("Must practice");
    }
}

class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("Syntax student must solve repls ");
    }
    @Override
    void practice(){
        System.out.println("Syntax students must research ");
    }
}
class CollegeStudents extends Student{
    @Override
    void doHomeWork(){
        System.out.println("Collage student must solve repls ");
    }
}
class SchoolStudents extends Student{

}