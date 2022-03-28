package com.syntax.class13;

public class MethodsDemo1 {
	
	void checkEvenOdd(int num) {
		if (num %2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	void checkWeather(boolean isRaining) {
		if(isRaining) {
			System.out.println("staying home");	
		}else {
			System.out.println("lets go for a walk");
		}
	}
	void nameCheck (String name) {
		if (name.equalsIgnoreCase("Teyfur")) {
			System.out.println("send memes");
		}else if(name.equalsIgnoreCase("maha")) {
			System.out.println("I am a doctor");
		}else {
			System.out.println("I don't know you");
		}
	}
	void TeyfurAndHorse(String name, String animal) {
		if (name.equalsIgnoreCase("Teyfur") && (animal.equalsIgnoreCase("Horse"))) {
			System.out.println("camel");
		}else {
			System.out.println("Horse");
		}
	}
	
	public static void main(String[] args) {
		
		MethodsDemo1 obj1 = new MethodsDemo1();
		obj1.checkEvenOdd(12);
		obj1.checkWeather(false);
		obj1.nameCheck("maha");
		obj1.TeyfurAndHorse("teyfur", "horse");
	}

}
