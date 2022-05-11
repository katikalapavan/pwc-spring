package com.day2;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.setsEmail("King@gmail.com");
		stud.setsName("pavan");
		stud.setSrno(10);
		stud.setSubject("maths");
		stud.displayStudent();
		//System.out.println(stud.getSrno()+ " " +stud.getsEmail()+" " +stud.getsName()+ " " +stud.getSubject());
System.out.println(stud.hashCode());
		Student student2=new Student();
		System.out.println(student2.hashCode());
		student2=stud;
		System.out.println(student2.hashCode());
	}

}
