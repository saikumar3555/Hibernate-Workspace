package com.nt.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Project {
	private int projID;
	private String projName;
	private int teamSize;
	private Date startDate;
	private Date releaseDate;

}
