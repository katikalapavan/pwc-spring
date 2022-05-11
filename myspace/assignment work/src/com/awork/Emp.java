package com.awork;

public class Emp {
int Eid;
String Name;
int Income;
String Dept;

public Emp(int eid, String name, int income, String dept) {
	super();
	Eid = eid;
	Name = name;
	Income = income;
	Dept = dept;
}
public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	Eid = eid;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getIncome() {
	return Income;
}
public void setIncome(int income) {
	Income = income;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}

}
