package com.nit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nit.entity.AirtelCallertune;
import com.nit.utility.HibernateUtil;

public class AirtelCallertuneDAOImpl implements AirtelCallertuneDAO {
	

	@Override
	public void save() {
		Session ses=null;
		Transaction tx=null;
		SessionFactory factory=null;
		AirtelCallertune tune=null;
		boolean flag=false;
		
		factory=HibernateUtil.getSessionFactory();
		ses=factory.openSession();
		tx=ses.beginTransaction();
		tune=new AirtelCallertune();
		tune.setCustId(2);
		tune.setCustName("Apa");
		tune.setMobileNo(9837366366L);
		tune.setCallerTune("LetsEnjoy");
		try {
			ses.save(tune);
			flag=true;
		}//try
		catch (Exception e) {
	e.printStackTrace();
		}//catch
		finally {
		if (flag) {
			tx.commit();
		}else {
			tx.rollback();
		}//else
		}//finally

	}//save
	
	
	////////////////////////////////
	public void load() {
		Session ses=null;
		Transaction tx=null;
		SessionFactory factory=null;
		AirtelCallertune tune=null;
		boolean flag=false;
		
		factory=HibernateUtil.getSessionFactory();
		ses=factory.openSession();
		tx=ses.beginTransaction();
		
		try {
			tune=ses.get(AirtelCallertune.class,1);
			tune.setCallerTune("SuccessLife");
			ses.update(tune);
			flag=true;
		}//try
		catch (Exception e) {
	e.printStackTrace();
		}//catch
		finally {
		if (flag) {
			tx.commit();
		}else {
			tx.rollback();
		}//else
		}//finally

	}//save
	
	

}//class
