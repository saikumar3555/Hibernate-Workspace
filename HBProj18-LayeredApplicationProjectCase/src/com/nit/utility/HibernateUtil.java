package com.nit.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory=null;
	private static ThreadLocal<Session> threadLocal=new ThreadLocal();
	
	static {
		//bootstrap the hibernate
		Configuration cfg =null;
		
		cfg=new Configuration();
		
		cfg.configure("/com/nit/cfgs/hibernate.cfg.xml");
		//create sessionFactory
		factory=cfg.buildSessionFactory();
		
	}//static
	public static Session getSession() {
		Session ses=null;
		if(threadLocal.get()==null) {
			ses=factory.openSession();
			threadLocal.set(ses);}
			else{
			ses=threadLocal.get();
		}
		return ses;	
	}//getSession
	public static void closeSession() {
		Session ses=null;
		if(threadLocal.get()!=null) {
			ses=threadLocal.get();
			ses.close();
		}
	}//closeSession 
	public static void closeSessionFactory() {
		if(factory!=null) {
			factory.close();
					}
	}
	

}//class
