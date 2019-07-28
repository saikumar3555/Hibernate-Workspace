package com.nt.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class QBCTest1 {
	
	public static void main(String[] args) {
		Session ses=null;
		Criteria criteria=null;
		List<Employee> list=null;
		Criterion cond=null;
		Order order=null;
		Projection p1=null,p2=null;
		
		//get Session
		ses=HibernateUtil.getSession();
		criteria=ses.createCriteria(Employee.class);
		cond=Restrictions.between("eno", 10, 30);
		criteria.add(cond);
		order.asc("desg");
		criteria.addOrder(order);
		
		criteria.setProjection(Projections.max("salary"));
		
		
		
		list=criteria.list();
		list.forEach(emp->System.out.println(emp));
		
	}//main

}//class
