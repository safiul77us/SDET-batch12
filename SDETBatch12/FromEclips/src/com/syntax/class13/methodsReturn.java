package com.syntax.class13;

public class methodsReturn {
	
	int squareTheNumber(int num) {
		return num * num;
	}
	
	String whoIs ( String name, String animal) {
		if ("Teyfur".equalsIgnoreCase(name) && "Horse".equalsIgnoreCase(animal)) {
			return "Camel";
		}else {
			return "Horse";
		}
	}

	public static void main(String[] args) {
			methodsReturn obj = new methodsReturn();
			
//			int outcome = obj.squareTheNumber(5);
//			System.out.println(outcome);
			String n = obj.whoIs("Teyfur", "Hors");
			System.out.println(n);



			
	}

}
