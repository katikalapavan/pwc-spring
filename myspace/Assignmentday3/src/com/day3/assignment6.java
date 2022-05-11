package com.day3;

public class assignment6 {
String name;
assignment6 (String parameterVal)
{
name=parameterVal;	
}
assignment6 ()
{
this("Student");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment6 ass1=new assignment6 ("Faculty");
		assignment6  ass2=new assignment6 ();
		System.out.println(ass1.name);
		System.out.println(ass2.name);
	}

}
