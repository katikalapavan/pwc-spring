package com.day1;

public class Assignment2 {

	public static void main(String[] args) {
		
		int intVal = 0;
		float floatVal=3.0f;
		boolean bool1=true;
		boolean bool2=false;
		boolean bool3=true;
		System.out.println("Arthimatic");
		System.out.println(intVal + " % " + floatVal + "=" +
		(intVal % floatVal));
		System.out.println();
		System.out.println("Str concatenation");
		System.out.println("Day" + 2 + "Session");
		System.out.println("\n" + 2 + 3 +"\n"+(2+3));
		System.out.println();
		System.out.println("relational");
		System.out.println(intVal + " == " + floatVal + "=" +
		(intVal == floatVal));
		floatVal=10.0f;
		System.out.println(intVal + " == " + floatVal + "=" +
				(intVal == floatVal));
		System.out.println();
		bool2=false;
		if(bool1 || (bool1 && (bool2=false))) {
			System.out.println("success");
		}else {
			System.out.println("failure");
		}
		System.out.println("bool2 value :" +bool2);
		
	}

}
