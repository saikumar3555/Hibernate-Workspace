package com.nt.main;

import com.nt.dao.TranferEmployeeDaoFactory;
import com.nt.dao.TransferEmployeeDao;
import com.nt.dao.TransferEmployeeDaoImpl;

public class TranferEmployeeTest {

	public static void main(String[] args) {
	TransferEmployeeDao dao=null;
	int count=0;
	
	//get dao
	dao=TranferEmployeeDaoFactory.getInstance();
	
	//use dao
	count=dao.transferEmployeeAsNGOMember(10000,11000);
	if(count>=1) {
	System.out.println(count+"Records are Transfered...");
	}else {
		System.out.println(" No Records are found to Transfered...");	
	}

	}

}
