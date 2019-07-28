package com.nit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable{
	
	@Id
	@Column(name="eid")
	//@TableGenerator(name="sequence_name", initialValue=10,allocationSize=20)
	@TableGenerator(name="sequence_name")
	@GeneratedValue(generator ="seq",strategy=GenerationType.SEQUENCE)
	private int eno;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="desg")
	private String desg;
	
	@Column(name="salary")
	private float salary;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
