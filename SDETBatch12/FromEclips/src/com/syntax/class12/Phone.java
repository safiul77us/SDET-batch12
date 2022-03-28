package com.syntax.class12;

public class Phone {
	
	String make;
	String model;
	int noOfCams;
	String color;
	double screenSize;
	String os;
	String phoneNumber;
	
	void makeCall() {
	System.out.println("Making a call");	
	}
	
	void takePictures() {
		System.out.println("Taking pictures ");
	}
	
	void printCompleteInfo() {
		System.out.println("make "+make);
		System.out.println("model "+model);
		System.out.println("noOfCams "+noOfCams);
		System.out.println("color "+color);
		System.out.println("screenSize "+screenSize);
		System.out.println("os "+os);
		System.out.println("phoneNumber "+phoneNumber);
	}
	
	
}
