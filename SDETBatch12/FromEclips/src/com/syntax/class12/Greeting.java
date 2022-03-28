package com.syntax.class12;

public class Greeting {

	void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	void hellofive(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello " + name);
		}
	}
	void say(String name, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Hello " + name);
		}
	}
	
	
	public static void main(String[] args) {
		Greeting a = new Greeting();
		//a.sayHello("safiul");
		
		Greeting b = new Greeting();
		b.say("Gul", 4);
	}

}
