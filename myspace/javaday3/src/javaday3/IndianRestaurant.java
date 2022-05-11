package javaday3;

public class IndianRestaurant implements Restaurant{
	
	public String prepareFood(String dishName) {
		 
		return "preparing " + dishName + " with indian spices";
	}
}
