package com.nt.main;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class JPAQBCTest1 {

	public static void main(String[] args) {
      
		Session ses=null;
		CriteriaBuilder builder=null;
		CriteriaQuery<Employee> query=null;
		Root<Employee> employee=null;
		Query q=null;
		List<Employee> list=null;
		
		//get Session
		ses=HibernateUtil.getSession();
		
		//create CriteriaBuilder
		builder=ses.getCriteriaBuilder();
		
		query=builder.createQuery(Employee.class);
		
		employee=query.from(Employee.class);
		
		query.select(employee);
		
		q=ses.createQuery(query);
		
		list=q.getResultList();
		list.forEach(emp->{
			System.out.println(emp);
		});
		
		
	}//main

}//class
