package com.syntax.class14;

public class task1 {
	
	void largerNum(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1 + " is greater");
		}else if (num2 > num1){
			System.out.println(num2 + " is greater");
		}else {
			System.out.println(num1 + " and " + num1 + " are same");
		}
	}

	public static void main(String[] args) {
	
		task1 t1 = new task1();
		t1.largerNum(10, 10);
	}
}
