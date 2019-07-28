package com.nit.test;

import com.nit.dao.EmployeeTransferDAO;
import com.nit.dao.EmployeeTransferDAOFactory;
import com.nit.utility.MySQLHibernateUtil;
import com.nit.utility.OracleHibernateUtil;

public class EmployeeTransferFromDbs {
	public static void main(String[] args) {
		boolean flag=false;
		EmployeeTransferDAO dao=EmployeeTransferDAOFactory.getInstance();
		flag=dao.transfer(102);
		if(flag) {
			System.out.println("Employee Transfered");
			
		}else {
			System.out.println("Employee not  Transfered");
		}//else
		OracleHibernateUtil.closeSessionFactory();
		MySQLHibernateUtil.closeSessionFactory();
	}

}
