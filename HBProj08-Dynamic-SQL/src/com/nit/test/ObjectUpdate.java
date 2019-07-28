package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Products;
import com.nit.utility.HibernateUtil;

public class ObjectUpdate {

	public static void main(String[] args) {
	//	System.out.println("Main method start");
	Session ses=null;
	boolean flag= false;
	Transaction tx = null ;
	ses = HibernateUtil.getSession();
	Products p = null;
	p=new Products();
	p.setPid(559);
	p.setPname("laptop");
	p.setPprice(30000);
	//p.setPquantity(3);
	/*p.setIsExpired(false);*/
	
	try {
	tx=ses.beginTransaction();
	//update the record values
		ses.update(p);
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
