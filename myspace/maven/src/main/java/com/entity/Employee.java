package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Employee {
	@Id
private int empId;
	@Column(name="emp_name")
private String empName;
private String city;

public Employee() {
	super();
	
}
public Employee(int empId, String empName, String city) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.city = city;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + "]";
}

}
