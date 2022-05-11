package com.mypack;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User user = new User();
user.setuId(101);
user.setuName("pavan");
user.setuEmail("king@gmail.com");
System.out.println(user.getuId()+ " " +user.getuEmail()+" " +user.getuName());
	}

}
