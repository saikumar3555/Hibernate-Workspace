package com.nt.test;

import org.hibernate.Session;

import com.nt.entity.InsurancePolicy;
import com.nt.utility.HibernateUtil;

public class GetObjectTest {

	public static void main(String[] args) {
		Session ses=null;
		InsurancePolicy policy=null;
		//get Session
		ses=HibernateUtil.getSession();
		//Load object using ses.get(-,-) method
		try {
			policy=ses.get(InsurancePolicy.class,101);
			System.out.println(policy);
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//close HB objs
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		
	}//main
}//class
