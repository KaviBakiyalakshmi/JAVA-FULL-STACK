package com.Generic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class TempServlet implements Servlet
{
    private ServletConfig config=null;
    
	@Override
	public void destroy() 
	{
		
		config=null;
		System.out.println("Destroy Called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return config.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("Init Called");
		this.config=config;
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Service Called");
		PrintWriter  out= arg1.getWriter();
		out.println("This is My Servlet");
		
		
	}
	

}
