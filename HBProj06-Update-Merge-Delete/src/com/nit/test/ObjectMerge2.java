package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Products;
import com.nit.utility.HibernateUtil;

public class ObjectMerge2 {
	private static Session ses = null;
	
	public static void main(String[] args) {
		Transaction tx = null;
		Products p=null;
		Products p2=null;
		boolean flag =false;
		ses=HibernateUtil.getSession();
		//first product objrct
		p=new Products();
		p.setPid(923);
		p.setPname("mobile-m");
		p.setPprice(10000);
		p.setPquantity(2);
		
		//second product object
		p2=new Products();
		p2.setPid(923);
		p2.setPname("mobile-m");
		p2.setPprice(10000);
		p2.setPquantity(2);
		try {
			tx=ses.beginTransaction();
			//ses.merge(p);
			ses.save(p);
			ses.merge(p2);
			flag=true;
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
		finally {
			if(flag) {
				tx.commit();
				System.out.println("Object is saved or updated/merge");
			}else {
				tx.rollback();
				System.out.println("Object is  not saved or updated/merge");
				
			}
			
		}//finally
		
		
		
		
	}
		
}
