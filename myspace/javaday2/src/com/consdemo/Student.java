package com.consdemo;

public class Student {
	private int srno;
	private String sName;
	private String sEmail;
	private String subject;
	
	
	public Student(int srno, String sName, String sEmail, String subject) {
		super();
		this.srno = srno;
		this.sName = sName;
		this.sEmail = sEmail;
		this.subject = subject;
	}


	public Student(){
		// TODO Auto-generated method stub
		System.out.println("default");

	}


	@Override
	public String toString() {
		return "Student [srno=" + srno + ", sName=" + sName + ", sEmail=" + sEmail + ", subject=" + subject + "]";
	}

}
