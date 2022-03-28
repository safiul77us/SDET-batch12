package com.syntax.class27;

/*
2.	Create a Class Car that would have the following fields: carPrice and color and method
calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and
has its own implementation of calculateSalePrice() method in which returned
price calculated as following: if weight>2000 then returned price car should
include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of
calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
 */


abstract class Marks{
   abstract double getPercentage();

}
class A extends Marks{

   private double subject1;
   private double subject2;
   private double subject3;

   A(double subject1,double subject2,double subject3){
      this.subject1=subject1;
      this.subject2=subject2;
      this.subject3=subject3;
   }
   @Override
   double getPercentage() {
      return (subject1+subject2+subject3)/3;
   }
}

class B extends Marks{

   private double subject1;
   private double subject2;
   private double subject3;
   private double subject4;

   B(double subject1,double subject2,double subject3,double subject4){
      this.subject1=subject1;
      this.subject2=subject2;
      this.subject3=subject3;
      this.subject4=subject4;
   }
   @Override
   double getPercentage() {
      return (subject1+subject2+subject3+subject4)/4;
   }
}

public class Task2 {
   /*
   We have to calculate the average of marks obtained in three subjects by student
    A and 4 subjects by student B. Create class 'Marks' with an abstract method 'getAvg'
    that will be returning the average of marks. Provide implementation of
    abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in three
   subjects as its parameters and the marks in four subjects as its parameters for student B.
   Test your code
    */
   public static void main(String[] args) {
      A a=new A(10,20,30);
      System.out.println(a.getPercentage());
   }
}