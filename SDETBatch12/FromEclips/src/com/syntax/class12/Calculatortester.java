package com.syntax.class12;

public class Calculatortester {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add();
		
		cal.addNumbers(10, 5);
		int n1 = 100;
		int n2 = 101;
		cal.addNumbers(n1, n2);
	}

}
