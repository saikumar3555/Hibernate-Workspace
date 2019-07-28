package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nt.utility.HibernateUtil;

public class TransferEmployeeDaoImpl implements TransferEmployeeDao {

	@Override
	public int transferEmployeeAsNGOMember(float startSalary,float endSalary) {
		Session ses=null;
		Transaction tx=null;
		Query query=null;
		boolean flag=false;
		int count=0;
		
	  final String HQL_Insert="insert into NGOMember(eno,ename,desg,salary) select eno,ename,desg,salary from Employee e where salary between :min and :max";
		
		//getSession
		ses=HibernateUtil.getSession();
		query=ses.createQuery(HQL_Insert);
		query.setParameter("min", startSalary);
		query.setParameter("max", endSalary);
		
		
		
		try {
			tx=ses.beginTransaction();
			count=query.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
			flag=false;
		}//catch
		
		finally {
			     if(flag) {
			    	 tx.commit();
			    	 //System.out.println(count +"Records are inserted");
			       }else {
			    	   tx.rollback();
			    	  // System.out.println("Records are not found");
			       }
			
		}//finally
		return count;
	}

}
