package com.sam;
import java.util.ArrayList;

import java.util.Collections;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> al=new ArrayList<User>();
		al.add(new User(101,"adam","ad@"));
		al.add(new User(102,"adamq","ad@1"));
		al.add(new User(103,"adamw","ad@2"));
		//Collections.sort(al,(User u1,User u2)-> u1.getuserName(),compareTo(u2.getuserName()));
		for(User us:al) {
			System.out.println(us);
		}
	}

}
