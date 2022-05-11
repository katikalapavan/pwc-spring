package com.exception;

public class Excepton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int data =10/0;
		}catch(ArithmeticException e) {
			System.out.println("dont divide by ZERO");
		}

	}

}
