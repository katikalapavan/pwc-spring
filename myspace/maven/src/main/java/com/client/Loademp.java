package com.client;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Query;
import com.hibernate.HibernateUtility;
//import com.mysql.cj.Query;
import com.entity.Employee;

public class Loademp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtility.getSession();
		Query query =(Query)session.createQuery("from Employee");
		List<Employee> lst= query.list();
		for(Employee em:lst) {
			System.out.println(em);
		}
	}

}
