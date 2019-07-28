package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.Products;
import com.nit.utility.HibernateUtil;

public class ObjectUpdate2 {

	public static void main(String[] args) {
		System.out.println("Main method start");
	Session ses=null;
	boolean flag= false;
	Transaction tx = null ;
	ses = HibernateUtil.getSession();
	/*Products p = null;
	p=new Products();
	p.setPid(101);
	p.setPname("Milk");
	//p.setPprice(29);
	p.setPquantity(3);*/
	/*p.setIsExpired(false);*/
	
	try {
	tx=ses.beginTransaction();
	//update the record values
	Products p=(Products)ses.get(Products.class, 101);
	if(p==null) {
		/*ses.update(p);*/
	/*	flag= true;*/
		System.out.println("Object is Not found");}else {
			p.setPquantity(99);
			p.setPprice(20);
			ses.update(p);
			System.out.println("Object is updated");
			flag=true;
		}
		
	
		
	}catch (Exception e) {
		e.printStackTrace();
		flag=false;
	}finally {
	
	if(flag) {
		tx.commit();
	}else {tx.rollback();
	}
	}
	HibernateUtil.closeSession(ses);
	HibernateUtil.closeSessionFactory();
	

	}

}
