package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import lombok.Data;
@Data
@Entity
@Table(name="Employee")
@org.hibernate.annotations.NamedNativeQuery(name="FUN_CALL", 
                                           query="{?=call fx_GET_EMP_DETAILS(?,?)}",
                                          callable=true,
                                           resultClass=Employee.class
		                                    )
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eno;
	private String ename;
	private String desg;
	private float salary;

}
