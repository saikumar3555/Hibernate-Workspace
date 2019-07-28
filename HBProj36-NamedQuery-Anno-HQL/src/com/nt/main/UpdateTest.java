package com.nt.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class UpdateTest {

	public static void main(String[] args) {
	      Session ses=null;
	      Query query=null;
	      Transaction tx=null;
	      int count=0;
	      boolean flag=false;
	      
	      //get Session
	      ses=HibernateUtil.getSession();
	      //getting named query
	      query=ses.getNamedQuery("UPDATE_SALARY_BY_DESG");
	      query.setParameter("amt",10000f);
	      query.setParameter("name","Engineer");
	    
	      try {
	    	  tx=ses.beginTransaction();
	    	 count=query.executeUpdate();
	    	 flag=true;
	      }catch (Exception e) {
          e.printStackTrace();
          flag=false;
            }
	               finally{
	            	   if(flag) {
	            		   tx.commit();
	            		   System.out.println(count+" Records are Updated...");
	            	   }else {
	            		   tx.rollback();
	            		   System.out.println(count+" Records are Updated...");
	            	   }
	            	   
	    	  HibernateUtil.closeSession(ses);
	    	  HibernateUtil.closeSessionFactory();
	      }
	      
	      
	      
	      
		}
}
