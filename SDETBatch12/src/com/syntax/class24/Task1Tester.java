package com.syntax.class24;

public class Task1Tester {
    public static void main(String[] args) {
//        Student st = new SyntaxStudent();
//        Student st = new SchoolStudents();

        Student [] students = {
                new SyntaxStudent(),
                new SchoolStudents(),
                new CollegeStudents()};
        students[0].practice();
        for (Student student:students){
            student.study();
            student.doHomeWork();
            student.practice();
        }
    }
}
