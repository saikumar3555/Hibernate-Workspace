package com.nit.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;



public class HibernateUtil {
	
	private static SessionFactory factory = null;
	
	static {
		try {
		Configuration cfg = null;
		//bootstrap the hibernate
		cfg = new Configuration();
		cfg.configure("/com/nit/cfgs/hibernate.cfg.xml");
		
		
		
		/*
		//creating builder
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		
		//To add custom Services to builder
		builder.addService(myChoiceConnectionProvider.class, new myChoiceConnectionProvider);
		//create service registry
		StandardServiceRegistry registry=builder.applySettings(cfg.getProperties()).build();
		
		//create session factory
		SessionFactory factory=new SessionFactory(registry);*/
		
		
		
		
		
		//build SessionFactory
		//factory = cfg.buildSessionFactory();
		
		
		
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
		
	}public  static SessionFactory getSessionFactory() {
		return factory;
	}
	
	
	
	
	

}
