package com.sam;
public interface Defaultdemo {
public void show();
public void add();
public default void demo() {
	System.out.println("Demo");
}
}
