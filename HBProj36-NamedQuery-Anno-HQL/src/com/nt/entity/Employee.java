package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;

@Data
@Entity
@NamedQuery(name="GET_EMP_BY_DESG",query="from Employee where desg=:name")
@NamedQuery(name="UPDATE_SALARY_BY_DESG",query="update Employee set salary=salary+:amt where desg=:name")
public class Employee {
	@Id
	@Column(name="EID")
	private int eno;
	private String ename;
	private String desg;
	private float salary;

}
