package com.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.Employee;
import com.nit.utility.HibernateUtil;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class SaveObjectTest {

	public static void main(String[] args) {

		Configuration cfg = null;
		//SessionFactory factory = null;
		Session ses = null;
		Session ses1 = null;
		Employee emp = null;
		Transaction tx = null;
		boolean flag = false;
		SessionFactory factory=null;
		
		
		cfg=new Configuration();
		cfg.configure("/com/nit/cfgs/hibernate.cfg.xml");
		factory=HibernateUtil.getSessionFactory();
		ses=factory.getCurrentSession();
		
		emp=new Employee();
		emp.setEno(67);
		emp.setEname("shamapan");
		emp.setDesg("looser");
		emp.setSalary(0);
		tx=ses.beginTransaction();
		ses.save(emp);
		tx.commit();
		
	    	//ses1=factory.getCurrentSession();
	       //System.out.println("ses "+ses +" ses1"+ses1);
		
		
		
	}//main

}//class
