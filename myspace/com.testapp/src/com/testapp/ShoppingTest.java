package com.testapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingTest {
private Shopping cart=new Shopping();
Product p1;
Product p2;
@BeforeEach
public void addDefaults() {
	p1=new Product("soap",10);
	p2=new Product("book",12);
	cart.AddItem(p1);
	cart.AddItem(p2);
}
	@Test
	void testAddItem() {
		assertEquals(2,cart.getItemscount());
	}
	@Test
void testRemove() throws ProductNotFoundException{
		//lstTest.remove("Orange");
		cart.removeProduct(p1);
		assertEquals(1,cart.getItemscount());
        
}
	@Test
	void testBalance() {
		//cart.balanceProduct(p2);
		//assertEquals(22.0,cart.getItemscount());
		assertEquals(22.0, cart.getBalance());
	}
	
}
