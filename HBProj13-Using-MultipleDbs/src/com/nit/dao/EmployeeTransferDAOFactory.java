package com.nit.dao;

public class EmployeeTransferDAOFactory {
	public static EmployeeTransferDAO getInstance() {
		return new EmployeeTransferDAOImpl();
	}

}
