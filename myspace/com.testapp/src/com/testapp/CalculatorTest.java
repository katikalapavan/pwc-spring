package com.testapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	
int a;
	public void callBefore() {
	a=10;
		System.out.println("calling");
	}
	void testAdd() {
	assertEquals(25,new Calculator().add(12,13));
	++a;
	}
	

}
