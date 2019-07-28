package com.nit.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Employee;
import com.nit.utility.MySQLHibernateUtil;
import com.nit.utility.OracleHibernateUtil;

public class EmployeeTransferDAOImpl implements EmployeeTransferDAO {

	@Override
	public boolean transfer(int eid) {
		Session oracleSes =null;
		Session mysqlSes =null;
		Employee emp=null;
		boolean flag=false;
		Transaction tx=null;
		//get oracle session
		oracleSes =OracleHibernateUtil.getSession();
		mysqlSes=MySQLHibernateUtil.getSession();
		emp=mysqlSes.get(Employee.class,eid);
		System.out.println(emp);
		if(emp==null) {
			return false;
		}else {
			try {
				tx=oracleSes.beginTransaction();
				oracleSes.save(emp);
				tx.commit();
				flag=true;
				
			}//try
			catch(Exception e) {
				e.printStackTrace();
				flag=false;
			}//catch
			finally {
				if(flag) {
					//tx.commit();
					flag=true;
				}else {
					tx.rollback();
					flag=false;
				}
			}//finally
			 MySQLHibernateUtil.closeSession(mysqlSes);	
			OracleHibernateUtil.closeSession(oracleSes);
			
				
		}//else
		
		
		return flag;
	}//method

}//class
