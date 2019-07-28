package com.nit.dto;

import java.io.Serializable;
import java.util.Date;

public class ProjectDTO implements Serializable {
	private int ProjId;
	private String ProjName;
	public int getProjId() {
		return ProjId;
	}
	public void setProjId(int projId) {
		ProjId = projId;
	}
	public String getProjName() {
		return ProjName;
	}
	public void setProjName(String projName) {
		ProjName = projName;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getDomaiin() {
		return domain;
	}
	public void setDomaiin(String domaiin) {
		this.domain = domaiin;
	}
	public Date getSdop() {
		return sdop;
	}
	public void setSdop(Date sdop) {
		this.sdop = sdop;
	}
	public Date getCdop() {
		return cdop;
	}
	public void setCdop(Date cdop) {
		this.cdop = cdop;
	}
	private int teamSize;
	private String domain;
	private Date sdop;
	private Date cdop;

}
