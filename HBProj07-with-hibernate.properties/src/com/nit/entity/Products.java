package com.nit.entity;

import java.io.Serializable;

public class Products implements Serializable {
	
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pquantity=" + pquantity + "]";
	}
	private int pid;
	private String pname;
	private float pprice;
	private int pquantity;
	/*private boolean isExpired;*/
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPprice() {
		return pprice;
	}
	public void setPprice(float pprice) {
		this.pprice = pprice;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	/*public boolean getIsExpired() {
		return isExpired;
	}
	public void setIsExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}*/

}
