package com.nit.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class HibernateUtil {
	private static SessionFactory factory;
	static {
		try {
		Configuration cfg=null;
		//Bootstrap the hibernate
		cfg=new Configuration();
		cfg.configure("/com/nit/cfgs/hibernate.cfg.xml");
		//build SessionFactory
		factory=cfg.buildSessionFactory();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public  static Session getSession() {
		Session ses=null;
		if(factory!=null)
			ses=factory.openSession();
		return ses;
	}
	
	public  static  void   closeSession(Session ses) {
		if(ses!=null)
			ses.close();
	}
	
	public static SessionFactory getSessionFactory() {
		
			return factory;
		
	}
	
	public static void  closeSessionFactory() {
		if(factory!=null)
			factory.close();
	}

}
