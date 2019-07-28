package com.nit.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.nit.utility.HibernateUtil;

public class SessionFactoryMgmtListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		HibernateUtil.closeSessionFactory();
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextInitialized(sce);
	}

}
