package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Products;
import com.nit.utility.HibernateUtil;

public class ObjectGet {
	public static void main(String[] args) {
	Session ses=null;
	Products p=null;
	Transaction tx=null;
	boolean flag=false;
	ses=HibernateUtil.getSession();
	
		
		p=(Products)ses.get(Products.class,101);
		if(p==null) {
			System.out.println("Record is not available...");
			return;
		}else {
			try {
			tx=ses.beginTransaction();
			System.out.println(p);
			ses.delete(p);
			flag=true;
		}catch (Exception e) {
			e.printStackTrace();
		}//catch
		finally {
			if(flag) {
				tx.commit(); 
				System.out.println("record is deleted");
			}else {
				tx.rollback();
				System.out.println("record is not deleted");
			}
		
		
	}//
	
		
		
	}
}//main


}
