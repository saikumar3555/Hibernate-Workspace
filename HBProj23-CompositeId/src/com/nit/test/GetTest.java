package com.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nit.entity.ProgramerProjectId;
import com.nit.entity.ProgramersProject;
import com.nit.utility.HibernateUtil;

public class GetTest {
	
public static void main(String[] args) {
		
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		ProgramersProject progporj=null;
		ProgramerProjectId idclass=null,idVal=null;
		boolean flag=false;
		int generatedId=0;
		
		factory=HibernateUtil.getSessionFactory();
		ses=factory.openSession();
		
		//create id class
		idclass=new ProgramerProjectId();
		idclass.setProgramerId(101);
		idclass.setProjectId(9001);
		//create domain class object
		
		
		
		try {
			tx=ses.beginTransaction();
			progporj=ses.get(ProgramersProject.class, idclass);
			System.out.println(progporj);
			flag=true;		
		}//try
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Record is not found");
			flag=false;
		}//catch
		finally {
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
				
			}
		}
		
		
		
		
		
		
	}
	



