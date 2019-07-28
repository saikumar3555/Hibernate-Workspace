package com.nt.main;

import java.util.List;

import javax.persistence.ParameterMode;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.result.Output;
import org.hibernate.result.ResultSetOutput;

import com.nt.entity.Employee;
import com.nt.utility.HibernateUtil;

public class Procedure_Call_Test {

	public static void main(String[] args) {
    
		Session ses=null;
		ProcedureCall call=null;
		Output output=null;
		List<Employee> list=null;
        
		
		//get session
		ses=HibernateUtil.getSession();
		try {
			//create ProcedureCall Object
			call=ses.createStoredProcedureCall("p_GET_EMPLOYEE_BY_ID",Employee.class);
			
			//Register IN,Out parameters with JDBC types and Bind calues to IN Param
			call.registerParameter(1, Employee.class,ParameterMode.REF_CURSOR);
			call.registerParameter(2, Integer.class,ParameterMode.IN).bindValue(10);
			call.registerParameter(3, Integer.class,ParameterMode.IN).bindValue(100);
			//call PL/SQL procedure and process the result
			output=call.getOutputs().getCurrent();
			list=((ResultSetOutput)output).getResultList();
			
			list.forEach(emp->
	System.out.println(emp)
					);
			
			
		}catch (Exception e) {
         e.printStackTrace();
		}
		
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		
		
	}//main

}//class
