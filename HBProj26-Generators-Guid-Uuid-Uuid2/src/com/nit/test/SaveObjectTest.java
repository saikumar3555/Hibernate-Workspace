package com.nit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.Employee;
import com.nit.utility.HibernateUtil;

public class SaveObjectTest {

	public static void main(String[] args) {
		

		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Transaction tx=null;
		Employee emp=null;
		boolean flag=true;
		String generatedId=null;
		
		factory=HibernateUtil.getSessionFactory();
		//create Employee object
		emp=new Employee();
		//emp.setEno(4001);
		emp.setEname("Manikanta");
		emp.setDesg("Engineer");
		emp.setSalary(20909);
		try {
			ses=factory.openSession();
			tx=ses.beginTransaction();
			generatedId=(String) ses.save(emp);
			System.out.println("generated id val :: "+generatedId);
			flag=true;
			
		}catch (Exception e) {
			e.printStackTrace();
			flag=false;
		}//catch
		finally {
			if (flag) {
				tx.commit();
				System.out.println("Object is saved succesfully");
			}else {
				tx.rollback();
				System.out.println("Object is not saved");
			}
		}
		
		
		
		
	}

}
