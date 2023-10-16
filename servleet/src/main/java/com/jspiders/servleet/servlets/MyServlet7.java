package com.jspiders.servleet.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MyServlet7")
public class MyServlet7 extends HttpServlet
{
	private static final long serialVersionUID=1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException,ServletException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int sum=num1+num2;
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<h1>sum of "+ num1 + " and "+ num2 +" = "+ sum+"</h1>");
	}
}


//type on url----->http://localhost:8080/servleet/Add1.html

