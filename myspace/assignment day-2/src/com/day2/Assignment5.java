package com.day2;

public class Assignment5 {
	private int srno;
	private String sName;
	public Assignment5(int srno, String sName) {
		super();
		this.srno = srno;
		this.sName = sName;
	}
	public Assignment5(){
		// TODO Auto-generated method stub
		System.out.println("default");

	}


	@Override
	public String toString() {
		return "Assignment5 [srno=" + srno + ", sName=" + sName + ",]";
	}
}
