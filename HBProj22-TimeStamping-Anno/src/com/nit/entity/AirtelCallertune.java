package com.nit.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data

@Entity
@Table(name="AIRTEL_CALLERTUNE2")
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
	@Column(name="MODIFICATIONCOUNT",length=3)
	@Version
	private int updationCount;
	
	@Column(name="SUBSCRIBEDDATE")
	@CreationTimestamp
	private LocalDateTime subscribedDate;
	@Column(name="UPDATIONSUBS")
	@UpdateTimestamp
	private LocalDateTime  updationSubs;  

}
