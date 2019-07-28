package com.nt.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class TestSelect {
	 
	public static void main(String[] args) {
		Session ses=null;
		Query query=null;
		List<Employee> list=null;
		Iterator<Employee> it=null;
		List<Object[]> list2=null;
		List<String> list3=null;
		Transaction tx=null;
		boolean flag=false;
		int count=0;
		
		ses=HibernateUtil.getSession();
		
		//query=ses.createQuery("from Employee");
/*
		list=query.list();
		list.forEach(emp->System.out.println(emp));*/
		/*it=query.iterate();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		    /* query=ses.createQuery("from Employee where eno between ?1 and ?2");
		 query.setParameter(1, 1);
	     query.setParameter(2, 200);*/
		
		
		/*query=ses.createQuery("from Employee where eno=:id");
		query.setParameter("id", 44);*/
		
		//selecting specifice columns from database table
		/*query=ses.createQuery("select eno,ename,salary from Employee");

		list2=query.list();
		for(Object[] row:list2) {
			for(Object val:row) {
				System.out.print(val+" ");
			}
		}*/
		/*
		query=ses.createQuery("select ename from Employee");
		list3=query.list();
		for(String val:list3) {
			System.out.println(val);
		}*/
	     query=ses.createQuery("delete from Employee where salary between  :min and :max");
	     query.setParameter("min",10000f);
	     query.setParameter("max", 12000f);
	     try {
	    	 tx=ses.beginTransaction();
	    	//no= query.executeUpdate();
	    	 count=(int)query.executeUpdate();
	    	 flag=true;
	    	 
	     }catch(Exception e) {
	    	 e.printStackTrace();
	    	 flag=false;
	     }//catch
	     finally {
	    	 if(flag) {
	    		 tx.commit();
	    		 if(count>=1) {
				System.out.println(count +" no of records are deleted");
	    		 }else {
	    			 System.out.println("Records are not found to delete...");
		    	 }
	    		 
	    	 }else {
	    		 tx.rollback();
	    		 System.out.println("Records are not found to delete...");
	    	 }
	    	//close objects
	 		HibernateUtil.closeSession(ses);
	 		HibernateUtil.closeSessionFactory();
	     }//finally	
	
	}

}//class