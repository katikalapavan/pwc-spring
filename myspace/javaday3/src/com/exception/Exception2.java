package com.exception;

public class Exception2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]=new int[5];
		a[5]=20/2;
		}catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("check the length of array");
		}
catch (Exception e)
		{
	System.out.println("handles");
		}
		finally {
			System.out.println("called always");
		}
	}
}
