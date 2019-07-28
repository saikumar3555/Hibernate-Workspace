package com.nit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.sql.rowset.serial.SerialException;

import com.nit.dto.ProjectDTO;
import com.nit.service.ProjectService;
import com.nit.service.ProjectServiceImpl;

public class MainControllerServlet extends HttpServlet {
	
	ProjectService service=null;
	public void init()throws SecurityException{
		service=new ProjectServiceImpl();
	}
	public void doGet(ServletRequest req,ServletResponse res)throws SerialException,IOException, ServletException{
		int pid=0;
		ProjectDTO dto=null;
		RequestDispatcher rd=null;

		pid=Integer.parseInt(req.getParameter("pid"));
		dto=service.searchProjectById(pid);
		req.setAttribute("pDetails", dto);
		rd=req.getRequestDispatcher("/controller");
		rd.forward(req,res);
		
		
		
	}
  public void destroy() {
	  service=null;
  }
}
