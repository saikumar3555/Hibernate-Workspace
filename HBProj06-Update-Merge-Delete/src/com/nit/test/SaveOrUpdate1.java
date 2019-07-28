package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Products;
import com.nit.utility.HibernateUtil;

public class SaveOrUpdate1 {
	public static void main(String[] args) {
		Session ses= null;
		Products p=null;
		  Transaction tx=null;
		boolean flag = false;
		//build session
		ses=HibernateUtil.getSession();
		//object creation
		// p =(Products)ses.get(Products.class,101);
		p=new Products();
		
	//ses.beginTransaction();
		
		try {
			/*if(p!=null) {*/
				tx=ses.beginTransaction();
				p.setPid(222);
				p.setPname("table2");
				p.setPprice(250);
				p.setPquantity(10);
			ses.saveOrUpdate(p);
			tx.commit();
			flag=true;
			
			
		}//try
		catch (Exception e) {
		e.printStackTrace();
		flag=false;
		}//catch
		finally {
			if(flag) {
				//tx.commit();
				System.out.println("Object is saved or updated");
				
			}else {
				tx.rollback();
				System.out.println("Object is not saved or updated");
			}//else
		}//finally
		
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
	}
	

}
