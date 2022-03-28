package com.syntax.class12;

public class Dog {
	
	//attributes, fields, properties 
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	
	//Behaviors , functions and methods. 
	void bark() {
		System.out.println("Dog is barking");
	}
	
	void eat() {
		System.out.println("Dog is eating");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	public static void main(String[] args) {
		
		//Creating an object scooby from class Dog. 
		Dog scooby=new Dog();
		
		/*
		 * Dog is a class
		 * scooby is an object
		 * = is an assignment operator 
		 * new is keyword that we us to create the objects of a class
		 * scanner scan = new Scanner(System.in);
		 * 
		 */
		scooby.bark();
		scooby.sleep();
		scooby.eat();
	}

}
