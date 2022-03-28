package com.syntax.class12;

public class phoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="Iphone 13 pro max";
		iphone.noOfCams=3;
		iphone.color="blue";
		iphone.screenSize=6.8;
		iphone.os="IOS";
		iphone.phoneNumber="578966855";
		iphone.makeCall();
		iphone.takePictures();
		iphone.printCompleteInfo();
		
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S22 ultra";
		samsung.noOfCams=4;
		samsung.color = "black";
		samsung.screenSize = 6.8;
		samsung.os = "Android 12";
		samsung.makeCall();
		samsung.takePictures();
		
	}


}
