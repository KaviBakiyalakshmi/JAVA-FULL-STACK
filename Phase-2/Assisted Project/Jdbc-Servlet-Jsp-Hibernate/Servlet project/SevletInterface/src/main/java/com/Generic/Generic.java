package com.Generic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class Generic extends GenericServlet
{

public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		
		PrintWriter out=res.getWriter();
		out.println("Output from generic Servlet");
		
	
		
	}

}
