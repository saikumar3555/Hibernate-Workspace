package com.nit.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.entity.InsurancePolicy;


public class LoadObject {
	public static void main(String[] args) {
	
	Configuration cfg = new Configuration();
	cfg.configure("/com/nit/cfgs/hibernate.cfg.xml");
	
	SessionFactory ses =cfg.buildSessionFactory();

	Session s =ses.openSession();
	InsurancePolicy ins =new InsurancePolicy();
	ins.setPolicyId(101);
	ins.setPolicyName("ANANDSER");
	ins.setPremium(9000);
	ins.setPremium(900);
	s.save(ins);
	Transaction tx = s.beginTransaction();
	tx.commit();
	s.close();
	ses.close();
	
	
	}
	

}
