package com.nit.listeners;

import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import com.nit.utility.HibernateUtil;

public class SessionMgmtListner implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		
		System.out.println("SessionMgmtListner.requestDestroyed()");
		HibernateUtil.closeSession();
	}
	

}
