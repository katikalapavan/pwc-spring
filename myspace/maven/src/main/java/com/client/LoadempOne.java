package com.client;
import org.hibernate.Session;
//import org.hibernate.Query;
import com.hibernate.HibernateUtility;
//import com.mysql.cj.Query;
import com.entity.Employee;
public class LoadempOne {
public static void main(String[] args) {
	Session session=HibernateUtility.getSession();
	Employee em =(Employee)session.get(Employee.class,101);
	System.out.println(em.getEmpName());
}
}
