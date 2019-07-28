package com.nit.utility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {
	
	private static SessionFactory factory = null;
	
	static {
		try {
		Configuration cfg = null;
		Properties prop=null;
		//bootstrap the hibernate
		cfg = new Configuration();
		InputStream is=null;
		//load the properties file
		is=new FileInputStream("src/com/nit/commons/myfile.properties");
		prop =new Properties();
		prop.load(is);
		cfg.setProperties(prop);
		
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
