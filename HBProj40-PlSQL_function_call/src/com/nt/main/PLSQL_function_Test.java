package com.nt.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class PLSQL_function_Test {

	public static void main(String[] args) {
		Session ses=null;
		List<Employee> list=null;
		HibernateUtil.getSession();
		
		Query query=null;
		try {
		query=ses.getNamedQuery("FUN_CALL");
		query.setParameter(0, 10);
		query.setParameter(1, 100);
		
		list=query.list();
		list.forEach(emp->
		    System.out.println(emp)
				);
		}catch (Exception e) {
		 e.printStackTrace();
		}
		
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
		
	}

}
