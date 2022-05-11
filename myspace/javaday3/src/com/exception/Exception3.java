package com.exception;

public class Exception3 {

	public static void demo() {
		// TODO Auto-generated method stub
throw new NullPointerException("Exception called");

	}
	public static void main(String[] args) {
		try {
		
		demo();
		}catch(NullPointerException e) {
			System.out.println("Caught again");
		}
	}

}
