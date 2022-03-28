package com.syntax.class12;

public class Horse {
	String name;
	String breed;
	int age;
	double weight;
	
	void run() {
		System.out.println(name + " is running");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void CompleteInfo() {
		System.out.println("name " + name);
		System.out.println("breed " + breed);
		System.out.println("age " + age);
		System.out.println("weight " + weight);
	}
	
	public static void main(String[] args) {
		Horse besh = new Horse();
		besh.name = "spirit";
		besh.breed = "stallion";
		besh.age = 20;
		besh.weight = 400;
		
		Horse wind = new Horse();
		wind.name = "fly";
		wind.breed = "mix";
		wind.age = 21;
		wind.weight = 401;
		
		//besh.CompleteInfo();
		besh.run();
		//wind.CompleteInfo();
	}
}
