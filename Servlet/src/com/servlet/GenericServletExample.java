package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

@SuppressWarnings("serial")
public class GenericServletExample extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("this is using generic servlet");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> output from  generic servlet</h1>");
		out.print("<h1>todays date and time is "+ new Date().toString()+"</h1>");
		System.out.println("hello");
	} 

}
