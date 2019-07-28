package com.nit.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySQLHibernateUtil {
	
private static SessionFactory factory = null;
	
	static {
		try {
		Configuration cfg = null;
		//bootstrap the hibernate
		cfg = new Configuration();
		cfg.configure("/com/nit/cfgs/mysql-hibernate.cfg.xml");
		
		//build SessionFactory
		factory = cfg.buildSessionFactory();
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}//catch
		
	}//static
	public static Session getSession() {
		Session ses  = null;
		if(factory != null) 
			ses = factory.openSession();
			return ses;
	}
	
	//close session 
	public static void closeSession(Session ses) {
		if(ses!=null)
			ses.close();
		
	}
	//closeing SessionFactory
	public static void closeSessionFactory() {
		if(factory!=null)
			factory.close();
		
	}
	
	
	
	
	

}