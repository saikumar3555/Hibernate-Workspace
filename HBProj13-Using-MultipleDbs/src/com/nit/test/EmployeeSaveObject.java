package com.nit.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Employee;
import com.nit.utility.MySQLHibernateUtil;
import com.nit.utility.OracleHibernateUtil;

public class EmployeeSaveObject {

	public static void main(String[] args) {
		Session oraSes =null;
		Session mysqlSes =null;
		oraSes=OracleHibernateUtil.getSession();
		mysqlSes=MySQLHibernateUtil.getSession();
		Transaction txora=null;
		Transaction txmysql=null;
		
		boolean flag=true;
		Employee emp=new Employee();
		emp.setEno(45);
		emp.setEname("param");
		emp.setDesg("Trainer");
		emp.setSalary(10000);
		try {
			txora=oraSes.beginTransaction();
			txmysql=mysqlSes.beginTransaction();
			oraSes.save(emp);
			mysqlSes.save(emp);
			flag=true;
		}//try
		catch(Exception e) {
			e.printStackTrace();
			flag=false;
		}//catch
		finally {
			if(flag) {
				txora.commit();
				txmysql.commit();
			}else {
				txora.rollback();
				txmysql.rollback();
			}
		}//finally
		oraSes.close();
		mysqlSes.close();
		OracleHibernateUtil.closeSessionFactory();
		MySQLHibernateUtil.closeSessionFactory();
				
	}//main

}//class
