package javaday3;

public class ItalianRestaurant implements Restaurant{
	public String prepareFood(String dishName) {
		 
		return "preparing " + dishName + " with italian herbs";
	}
}
