package com.nit.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nit.entity.Address;
import com.nit.entity.Student;
import com.nit.utility.HibernateUtil;

public class ComponentMappingTest {

	public static void main(String[] args) {

		Session ses=null;
		ses=HibernateUtil.getSession();
		Transaction tx=null;
		
		Address addr=new Address();
		addr.setCity("SHABAR");
		addr.setHno("10AB");
        addr.setPinCode(505330);
        Student stud=new Student();
        stud.setSid(101);
        stud.setName("manish");
        stud.setCollege("GNI");
        stud.setBranch("ECE");
        stud.setAddress(addr);
        
		try {
			tx= ses.beginTransaction();
			ses.save(stud);
		}catch (Exception e) {

		e.printStackTrace();
		}finally {
			tx.commit();
			HibernateUtil.closeSession(ses);
		}
		
		
		
	}

}
