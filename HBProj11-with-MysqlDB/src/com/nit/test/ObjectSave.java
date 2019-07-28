package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.Products;
import com.nit.utility.HibernateUtil;

public class ObjectSave {

	public static void main(String[] args) {
		System.out.println("Main method start");
	Session ses=null;
	boolean flag= false;
	Transaction tx = null ;
	ses = HibernateUtil.getSession();
	Products p = null;
	p=new Products();
	p.setPid(2);
	p.setPname("Milk");
	p.setPprice(20);
	p.setPquantity(2);
	/*p.setIsExpired(false);*/
	
	try {
	tx=ses.beginTransaction();
		ses.save(p);
		flag= true;
		
	
		
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
