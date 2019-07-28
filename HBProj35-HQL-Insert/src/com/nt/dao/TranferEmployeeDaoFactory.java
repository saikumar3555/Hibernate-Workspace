package com.nt.dao;

public class TranferEmployeeDaoFactory {
	
	public static TransferEmployeeDao  getInstance() {
		return new TransferEmployeeDaoImpl();
	}

}
