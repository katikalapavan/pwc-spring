package com.testapp;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTestTest {

	int a;
	@BeforeAll
	
	public static void callOnceBefore() {
		System.out.println("Called before once");
		
	}
@AfterAll
	
	public static void callOnceAfter() {
		System.out.println("Called After once");
		
	}
	
	@BeforeEach
	public void CallBefore() {
		a=10;
		System.out.println("calling before");
	}
	@AfterEach
public void callAfter()
{
	System.out.println("Calling after");
}
	@Test
	void testTestAdd() {
		System.out.println(a);
		assertEquals(25,new Calculator().add(12,13));
		++a;
	}


}
