package com.ds;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=6;
String userlocation;
switch (a) {
case 1:
	userlocation="Pune";
	break;
case 2:
	userlocation="mumbai";
	break;
case 3:
	userlocation="nlr";
	break;
default:
	userlocation="unknown";
	break;
}
System.out.println("user location "+userlocation);
	}

}
