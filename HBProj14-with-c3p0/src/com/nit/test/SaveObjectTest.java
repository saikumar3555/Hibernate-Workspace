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
		Employee emp = null;
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
		emp = new Employee();
		emp.setEno(659);
		emp.setEname("Ayyappa");
		emp.setDesg("Software Engineer");
		emp.setSalary(14000);
		
		
		ses1=factory.openSession();
		ses1.get(Employee.class, 101);
		try {
			// begin Transaction
			tx = ses.beginTransaction();
			ses.save(emp);
			flag = true;
		} // try
		catch (Exception e) {
			flag = false;
			e.printStackTrace();

		} // catch
		finally {
			if (flag) {
				tx.commit();
				System.out.println("Object is saved  ");

			} else {
				tx.rollback();
			}
			ses.close();
			factory.close();
		} // finally

	}

}
