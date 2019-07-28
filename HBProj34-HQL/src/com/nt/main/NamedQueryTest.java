package com.nt.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class NamedQueryTest {

	public static void main(String[] args) {
      Session ses=null;
      Query query=null;
      List<Employee> list=null;
      //get Session
      ses=HibernateUtil.getSession();
      //getting named query
      query=ses.getNamedQuery("HQL_GET_EMP_RECORDS_BY_ID");
      query.setParameter("min",10);
      query.setParameter("max",500);
      
      //executing the query
      list=query.getResultList();
      
      //java8 Feature
      list.forEach(emp->{
    	  System.out.println(emp);
      });
      
      
	}

}
