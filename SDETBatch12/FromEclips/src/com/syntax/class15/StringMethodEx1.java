package com.syntax.class15;

public class StringMethodEx1 {

	public static void main(String[] args) {
		
		String name = "Mohammadd   hoooooooosssssaaainnnnnn";
		
		if(name.length() <= 12) {
			System.out.println("user name created");
		}else {
			System.out.println("Too long name.");
		}
		
		System.out.println(name.contains("Mo"));
	}

}
