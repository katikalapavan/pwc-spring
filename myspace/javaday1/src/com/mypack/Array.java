package com.mypack;

public class Array {
	
	static int[]loadData(){
		return new int[] {10,20,30,40};
	}

	public static void main(String[] args) {
		
int arr[]=loadData();
for(int mydata:arr) {
	System.out.println(mydata);
}
	}

}
