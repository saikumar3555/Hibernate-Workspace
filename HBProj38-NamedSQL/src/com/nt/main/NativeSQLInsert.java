package com.nt.main;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.nt.entity.Project;
import com.nt.utility.HibernateUtil;

public class NativeSQLInsert {

	public static void main(String[] args) {
		// String strQuery="select projID,projName,teamSize,startDate,releaseDate from Project where projId=:id";
		  // String strQuery="select projID,projName,teamSize,startDate,releaseDate from Project";
		 //String strQuery="insert into Project values(1006,'Proj6',10,'10-mar-2017','12-jan-2018')";
		 String strQuery="insert into Project values(:projId,:projName,:teamSize,:startDate,:endDate)";
		List<Project> list=null;
		Session ses=null;
		int count=0;
		boolean flag=false;
		Transaction tx=null;
		
		NativeQuery query=null;
		
		//get Session
		ses=HibernateUtil.getSession();
		
		query=ses.createSQLQuery(strQuery);
		query.setParameter("projId",1008);
		query.setParameter("projName","Proj8");
		query.setParameter("teamSize",10);
		query.setParameter("startDate","12-mar-1999");
		query.setParameter("endDate","12-jan-2002");
		
	try {
		tx=ses.beginTransaction();
        count= query.executeUpdate();	
        flag=true;
	}catch (Exception e) {
e.printStackTrace();	}
	finally {
		if(flag) {
			tx.commit();
			     System.out.println(count+"Number of Records are Inserted ");
		}else {
			tx.rollback();
			 System.out.println(count+"Number of Records are Inserted ");
		}
	}
		
		
		
		
		
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
		
		
	}
}
