package com.nit.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProgramersProject implements Serializable {
	//private int programerId;
	private ProgramerProjectId id;
	private String programerName;
	private double salary;
	//private int projectId;
	private String projectName;

}
