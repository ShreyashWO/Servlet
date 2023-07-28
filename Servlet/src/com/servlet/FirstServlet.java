package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> output from servlet</h1>");
		out.print("<h1>todays date and time is "+ new Date().toString()+"</h1>");
		System.out.println("hello");
		
	}

}
