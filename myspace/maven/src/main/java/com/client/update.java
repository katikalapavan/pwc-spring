package com.client;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.hibernate.HibernateUtility;
public class update {

	public static void main(String[] args) {
		Session session=HibernateUtility.getSession();
		Transaction tx=session.beginTransaction();
		Employee em=(Employee)session.get(Employee.class,101);
		em.setCity("delhi");
		session.update(em);
		tx.commit();
		System.out.println("user updated");

	}

}
