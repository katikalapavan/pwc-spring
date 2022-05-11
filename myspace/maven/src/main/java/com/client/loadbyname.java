package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entity.Employee;
import com.hibernate.HibernateUtility;

public class loadbyname {

	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		Query query =session.createQuery("from Employee where empName=:name");
		query.setParameter("name", "admin");
		List<Employee> lst= query.list();
		for(Employee em:lst) {
			System.out.println(em);
		}
	}

}
