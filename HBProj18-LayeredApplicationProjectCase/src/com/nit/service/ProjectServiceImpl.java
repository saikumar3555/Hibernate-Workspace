package com.nit.service;

import com.nit.dao.ProjectDAO;
import com.nit.dao.ProjectDAOImpl;
import com.nit.dto.ProjectDTO;
import com.nit.entity.Project;

public class ProjectServiceImpl implements ProjectService {
	ProjectDAO dao;
	public ProjectServiceImpl() {
		dao=new ProjectDAOImpl();
	}

	Project proj;
	ProjectDTO dto;
	@Override
	public  ProjectDTO searchProjectById(int pid) {
		
		proj=dao.getProjectDetailsById(pid);
		if(proj!=null) {
			 dto=new ProjectDTO();
			 dto.setProjId(proj.getProjId());
			 dto.setProjName(proj.getProjName());
			 dto.setTeamSize(proj.getTeamSize());
			 dto.setDomaiin(proj.getDomaiin());
			 dto.setSdop(proj.getSdop());
			 dto.setCdop(proj.getCdop());
		}
		
		return dto;
	}

}
