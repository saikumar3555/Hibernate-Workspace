package com.nit.entity;

public class InsurancePolicy {
	private int policyId;
	private String policyName;
	private float tenure;
	private float premium;
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public float getTenure() {
		return tenure;
	}
	public void setTenure(float tenure) {
		this.tenure = tenure;
	}
	public float getPremium() {
		return premium;
	}
	public void setPremium(float premium) {
		this.premium = premium;
	}

}
