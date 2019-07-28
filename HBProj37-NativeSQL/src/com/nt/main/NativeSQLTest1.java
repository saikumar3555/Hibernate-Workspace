package com.nt.main;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.StandardBasicTypes;

import com.nt.entity.Project;
import com.nt.utility.HibernateUtil;

public class NativeSQLTest1 {

	public static void main(String[] args) {
		Session ses=null;
		
		
		//NativeQuery query=null;
		SQLQuery query=null;
		List<Project> list=null;
		List<Integer> list2=null;
		
		ses=HibernateUtil.getSession();
		/*
		query=(NativeQuery) ses.getNamedQuery("GET_PROJDETAILS_BY_PROJID");
		query.setParameter("min", 100);
		query.setParameter("max", 200);
		
		list=query.getResultList();
		list.forEach(row->{
			System.out.println(row);
		});*/
		
		/*query=(NativeQuery) ses.getNamedQuery("GET_ALL_RECORDS");
		list2=query.getResultList();
		System.out.println(list2.get(0));*/
		
		query=(NativeQuery) ses.getNamedQuery("GET_ALL_RECORDS");
		list=query.getResultList();
		list.forEach(row->{
			System.out.println(row);
		});
		
		
		
		

		
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
		
		
	}
}
