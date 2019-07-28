/*package com.nit.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 static SessionFactory factory =null;
	  static Session session =null;
	static {
		try {
		Configuration cfg =new Configuration();
		 factory =cfg.buildSessionFactory();
		 
		session =factory.openSession();
		}catch (Exception e) {
		e.printStackTrace();
		}//catch end
	}//static end
	
	//creating session
	public static Session getSession() {
		if(factory!= null) {
			 factory.openSession();
			
		} return session;	
		
	}
	//closeing session
	public static  void closeSession() {
		if(factory!= null) {
			session.close();
		}
		
		
	}

}
*/