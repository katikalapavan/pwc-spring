package com.client;
import org.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.entity.Employee;
import com.hibernate.HibernateUtility;
public class client {
public static void main(String[] args) {
	
	Session session=HibernateUtility.getSession();
	Transaction tx=session.beginTransaction();
	Employee em=new Employee(102,"admin","bengal");
	session.save(em);
	tx.commit();
	System.out.println("user added");
}
}
