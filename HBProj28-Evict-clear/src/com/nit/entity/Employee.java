package com.nit.entity;

import java.io.Serializable;

public class Employee implements Serializable{
	private int eno;
	private String ename;
	private String desg;
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
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", salary=" + salary + "]";
	}
	

}
