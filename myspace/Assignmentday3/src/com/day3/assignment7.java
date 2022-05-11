package com.day3;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sid=25;
		assignment7 ass=new assignment7 ();
		System.out.println(sid);
		ass.passTheValueMethod(sid);
		System.out.println("The sid are" + sid);

	}
	public void passTheValueMethod(int sid)
	{
		sid=10;
		System.out.println("The sid are"+sid);
	}

}
