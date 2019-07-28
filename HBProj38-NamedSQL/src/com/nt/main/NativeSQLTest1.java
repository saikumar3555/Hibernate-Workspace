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
		// String strQuery="select projID,projName,teamSize,startDate,releaseDate from Project where projId=:id";
		  // String strQuery="select projID,projName,teamSize,startDate,releaseDate from Project";
		 // String strQuery="select projName,teamSize from Project where projId=:id";
		 //  String strQuery="select projName,teamSize from Project";
		String strQuery="select count(*) from project";
		
		
		//List<Project> list=null;
		   List<Object[]> list2=null;
		   List<Integer> list3=null;
		Session ses=null;
		
		NativeQuery query=null;
		
		//get Session
		ses=HibernateUtil.getSession();
		
		query=ses.createSQLQuery(strQuery);
		query.addScalar("count(*)",StandardBasicTypes.INTEGER);
		//query.setParameter("id",101);
		//query.addScalar("teamSize",StandardBasicTypes.INTEGER);
		//query.addScalar("projName",StandardBasicTypes.STRING);
		
		//query.addEntity(Project.class);
		
		
		list3=query.getResultList();
		
		/*list2.forEach(row->{	
			for(Object p:row) {
			    System.out.println(p.getClass());
		}
		});*/
		int cnt=list3.get(0);
		System.out.println(cnt);

		
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
		
		
	}
}
