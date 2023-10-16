package com.jspiders.servleet.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet6")
public class MyServlet6 extends HttpServlet
{
	public static final long serialVersionUID=1L;
	
	@Override
	public void doGet(HttpServletRequest res, HttpServletResponse resp) 
			throws ServletException, IOException 
			{
		int num1=Integer.parseInt(res.getParameter("num1"));
		
		int num2=Integer.parseInt(res.getParameter("num2"));
		
		int sum=num1+num2;
		
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();

		writer.println("<h1>sum of "+ num1 + " and " + num2 +"="+ sum +"</h1>");
			}

}

//type---->http://localhost:8080/servleet/Add.html


