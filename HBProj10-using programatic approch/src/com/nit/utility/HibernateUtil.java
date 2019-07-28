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

		//bootstrap the hibernate
		cfg = new Configuration();
		cfg.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
		cfg.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:xe");
		cfg.setProperty("hibernate.connection.username","hr");
		cfg.setProperty("hibernate.connection.password","hr");
		cfg.setProperty("hibernate.show_sql","true");
		cfg.setProperty("hibernate.format_sql","true");
		cfg.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		cfg.addFile("src/com/nit/entity.Products.hbm.xml");
	
		
		
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
