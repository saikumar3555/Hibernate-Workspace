package com.nit.dao;

import com.nit.dao.AirtelCallertuneDAO;
import com.nit.dao.AirtelCallertuneDAOImpl;

public class AirtelCallertuneFactory {
	
	public AirtelCallertuneDAO getInstance(String type){
		AirtelCallertuneDAOImpl impl=null;
		if(type.equals("Airtel"))
			impl= new AirtelCallertuneDAOImpl();
		 return impl;
	}
	

}
