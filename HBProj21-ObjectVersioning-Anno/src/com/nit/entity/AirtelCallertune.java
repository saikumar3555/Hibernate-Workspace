package com.nit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.Data;

@Data

@Entity
@Table(name="AIRTEL_CALLERTUNE")
public class AirtelCallertune  implements Serializable{ 
	@Id
	@Column(name="CUSTID",length=10)
	private int custId;
	@Column(name="CUSTNAME",length=10)
	
	private String custName;
	@Column(name="MOBILENO",length=10)
	private long mobileNo;
	@Column(name="CALLERTUNE",length=10)
	private String callerTune;
	@Column(name="UPDATIONCOUNT",length=3)
	@Version
	private int updationCount;

}
