package com.ds;

public class Data {
private final static int SIZE=15;
private int[] arrayOfInt=new int[SIZE];
public Data() {

	// TODO Auto-generated constructor stub
	for(int i=0;i<SIZE;i++) {
		arrayOfInt[i]=i;
	}
}
public void printEven() {
	InnerApp ip=new InnerApp();
	while(ip.hashNext()) {
		System.out.println(ip.getNext());
	}
	
}
public class InnerApp{
	private int next=0;
	public boolean hashNext() {
		return(next <=SIZE-1);
	}
	public int getNext() {
		int retValue=arrayOfInt[next];
		next+=2;
		return retValue;
	}
}
public static void main(String[] args) {
	Data ds = new Data();
	ds.printEven();
}
}
