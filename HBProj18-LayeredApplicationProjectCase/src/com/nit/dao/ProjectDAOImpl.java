package com.nit.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Project;
import com.nit.utility.HibernateUtil;

public class ProjectDAOImpl implements ProjectDAO {
	Project proj;

	@Override
	public Project getProjectDetailsById(int pid) {
		Transaction tx=null;
		Session ses=null;
		ses=HibernateUtil.getSession();
		proj=ses.get(Project.class,pid);
	
	
		return proj;
	}

}
