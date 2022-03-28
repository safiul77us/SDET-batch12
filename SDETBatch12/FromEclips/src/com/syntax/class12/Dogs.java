package com.syntax.class12;

public class Dogs {
	
	String name;
	String color;
	String size;
	
	void bark() {
		System.out.println(name + " is barking loud");
		System.out.println(" Stop barking " + name);
	}
	void sleep() {
		System.out.println(name + " is sleeping now");
	}
	void allInfo() {
		System.out.println("My name is " + name);
		System.out.println("My color is " + color);
		System.out.println("And I am " + size);
	}
	

	public static void main(String[] args) {
		Dogs Husky = new Dogs();
		Husky.name = "Fighter";
		Husky.color = "white";
		Husky.size = "Huge";
		
		
		Dogs Buldog = new Dogs();
		Buldog.name = "Killer";
		Buldog.color = "brown";
		Buldog.size = "medium";
		
		Dogs Labrador = new Dogs();
		Labrador.name = "tracker";
		Labrador.color = "black";
		Labrador.size = "not so huge";
		
		
		Buldog.sleep();
		Labrador.allInfo();
		
		
	}
}
