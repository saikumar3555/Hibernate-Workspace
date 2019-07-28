package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Products;
import com.nit.utility.HibernateUtil;

public class ObjectDelete1 {
	private static Session ses = null;
	
	public static void main(String[] args) {
		Transaction tx = null;
		Products p=null;
		boolean flag =false;
		ses=HibernateUtil.getSession();
		p=new Products();
		p.setPid(922);
	/*	p.setPname("mobile-s");
		p.setPprice(10000);
		p.setPquantity(2);*/
		try {
			tx=ses.beginTransaction();
			ses.delete(p);
			flag=true;
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
		finally {
			if(flag) {
				tx.commit();
				System.out.println("Object is Deleted");
			}else {
				tx.rollback();
				System.out.println("Object is  Deleted");
				
			}
			
		}//finally
		
		
		
		
	}
		
}
