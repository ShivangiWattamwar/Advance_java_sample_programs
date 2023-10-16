package com.jspiders.servleet.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet4 extends HttpServlet
{
	public static final long serialVersionUID=1L;
	
	public void doGet(HttpServletRequest res, HttpServletResponse resp) 
			throws ServletException, IOException 
			{
				doPost(res,resp);
			}
	@Override
	public void doPost(HttpServletRequest res, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<h1 style=color:purple>Hello World</h1>");
	}

}

