package com.nt.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class Procedure_Call_Test {

	public static void main(String[] args) {
    
		Session ses=null;
        Query query=null;
		List<Employee> list=null;
		
		//get session
		ses=HibernateUtil.getSession();
		
		try {
		query=ses.getNamedQuery("CALL_PROCEDURE");
		query.setParameter("min", 1);
		query.setParameter("max", 200);
		list=query.list();
		list.forEach(emp->System.out.println(emp));
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}//catch
		finally {
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		
	}//main

}//class
