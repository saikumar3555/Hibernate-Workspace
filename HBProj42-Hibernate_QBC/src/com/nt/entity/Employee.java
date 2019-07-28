package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ValueGenerationType;

import lombok.Data;

@Data
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="eid")
	private int eno;
	private String ename;
	private String desg;
	private float salary;

}
