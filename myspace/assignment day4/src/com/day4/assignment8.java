package com.day4;

public class assignment8 {
static int i=22;
static int j=14000;
static boolean k;
static boolean l;
public static void main(String[] args) {
	i=22;
	j=14000;
	assignment8 assignment8 =new assignment8 ();
	k=assignment8.Method1(i);
	l=assignment8.Method2(j);
	if(k==true && l==true)
	{
		System.out.println("is a new employee");
	}else {
		System.out.println("is not a new employee");
	}
}
public boolean Method1(int i)
{
	if(i>20 &&i<30)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public boolean Method2(int j)
{
	if (j>=14000&&j<20000)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
