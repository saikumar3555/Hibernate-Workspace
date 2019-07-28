package com.nit.test;

import com.nit.dao.AirtelCallertuneDAO;
import com.nit.dao.AirtelCallertuneFactory;

public class SaveTest {

	public static void main(String[] args) {
		AirtelCallertuneFactory factory=null;
		AirtelCallertuneDAO dao=null;
		factory=new AirtelCallertuneFactory();
		dao=factory.getInstance("Airtel");
		dao.save();
		//dao.load();

	}

}
