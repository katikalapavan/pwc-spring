package com.sam;

public interface Task1 {
	public void showApp();
	
	public default void showdata() {
		System.out.println("show");
	}
}
