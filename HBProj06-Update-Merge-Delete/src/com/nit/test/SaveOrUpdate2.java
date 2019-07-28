package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Products;
import com.nit.utility.HibernateUtil;

public class SaveOrUpdate2 {
	
	public static void main(String[] args) {
		Session ses=null;
		Products p=null;
		Transaction tx=null;
		
		ses=HibernateUtil.getSession();
		p=new Products();
		p.setPid(302);
		p.setPname("shampo");
		p.setPprice(500);
		p.setPquantity(3);
		try {
			tx=ses.beginTransaction();
			ses.saveOrUpdate(p);
			tx.commit();
			System.out.println("Object is saved or inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
			System.out.println("Object is not saved or inserted");
			
		}
		
	}

}
