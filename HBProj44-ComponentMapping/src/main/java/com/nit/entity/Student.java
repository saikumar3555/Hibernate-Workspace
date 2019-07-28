package com.nit.entity;

import lombok.Data;

@Data
public class Student {
	private int sid;
	private String name;
	private String branch;
	private String college;
	private Address address;

}
