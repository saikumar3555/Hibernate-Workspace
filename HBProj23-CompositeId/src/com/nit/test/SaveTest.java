package com.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nit.entity.ProgramerProjectId;
import com.nit.entity.ProgramersProject;
import com.nit.utility.HibernateUtil;

public class SaveTest {
	
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
		idclass.setProgramerId(103);
		idclass.setProjectId(9002);
		//create domain class object
		progporj=new ProgramersProject();
		progporj.setId(idclass);
		progporj.setProgramerName("sharan");
		progporj.setProjectName("UBI");
		progporj.setSalary(9000);
		
		
		try {
			tx=ses.beginTransaction();
			idVal=(ProgramerProjectId)ses.save(progporj);
			System.out.println(idVal);
			flag=true;		
		}//try
		
		catch (Exception e) {
			e.printStackTrace();
			flag=false;
		}//catch
		finally {
			if(flag) {
				tx.commit();
				System.out.println("Record is saved");
			}else {
				tx.rollback();
				System.out.println("Record not is saved");
				
			}
		}
		
		
		
		
		
		
	}
	

}
