package com.syntax.class22;

class Shape{
    double rad;
    Shape(double rad){
        this.rad=rad;
    }
}
class Circle extends Shape{
    Circle(double rad) {
        super(rad);
    }
    void calculateArea(){
        System.out.println(Math.PI*Math.pow(rad, 2));
    }
}
public class Task2 {
    public static void main(String[] args) {
        Circle cr = new Circle(2);
        cr.calculateArea();
    }
}
