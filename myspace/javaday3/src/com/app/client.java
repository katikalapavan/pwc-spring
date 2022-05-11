package com.app;

public class client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
user us = new user();
		
		UserDao ud =new UserDao1();
		try {
		ud.adduser(us);
		}catch(Daoexception e) {
		System.out.println(e.getMessage());
	}
		System.out.println("user added");
}
}
