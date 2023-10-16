package com.jspiders.servleet.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet2 extends GenericServlet
{
	public static final long serialVersionUID=1L;

	@Override
	public void service(ServletRequest res, ServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<h1>Hello World</h1>");
	}

}
