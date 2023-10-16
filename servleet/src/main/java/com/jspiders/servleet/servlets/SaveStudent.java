package com.jspiders.servleet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String[] courses = req.getParameterValues("course");

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();

		writer.println("<h1>Student Info</h1>");
		writer.println("<h1>" + name + "</h1>");
		writer.println("<h1>" + email + "</h1>");

		for (String course : courses) {
			writer.println("<h2>" + course + "</h2>");
		}
	}
}

//write in url
//http://localhost:8080/servleet/StudentRegistration.html
