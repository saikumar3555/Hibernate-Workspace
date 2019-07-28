package com.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.Employee;

public class SaveObjectTest {

	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Session ses1 = null;
		Employee emp = null,emp2=null,emp3=null;
		Transaction tx = null;
		boolean flag = false;
		// Bootstrap the hibernatre Application
		cfg = new Configuration();

		// Locate and read the cfg file and mapping file
		cfg.configure("/com/nit/cfgs/hibernate.cfg.xml");

		// build session factory
		factory = cfg.buildSessionFactory();

		// open session
		ses = factory.openSession();
		
		
		emp=ses.get(Employee.class, 44);
		System.out.println(emp);
		ses.evict(emp);
		System.out.println("evict method is called...");
		System.out.println(emp);
		emp2=ses.get(Employee.class, 44);
		System.out.println(emp2);
		ses.evict(emp2);
		
		
		
			
			ses.close();
			factory.close();
		

	}

}
