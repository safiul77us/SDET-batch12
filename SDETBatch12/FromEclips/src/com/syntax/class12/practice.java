package com.syntax.class12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		int[] arr = { 45, 23, 10 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int a : arr) {
			System.out.print(a + " ");
		}
		


	}

}
