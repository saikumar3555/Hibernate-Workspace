package com.nit.entity;
import java.io.Serializable;

import lombok.Data;

@Data
public class ProgramerProjectId implements Serializable {
	private int programerId;
	private int projectId;

}
