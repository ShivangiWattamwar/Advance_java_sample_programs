package com.jspiders.jsp.jsps;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationPage")
public class RegistrationPage extends HttpServlet {
	  
	 
	private static final long serialVersionUID = 1L;
		private static final String dburl = "jdbc:mysql://localhost:3306/weja2";
	    private static final String user = "root";
	    private static final String passward = "root";
		private PrintWriter writer;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        String email = request.getParameter("email");
	        String address = request.getParameter("address");
	        String contact = request.getParameter("contact");
	     
	        try {
	        	Class.forName("com.mysql.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(dburl, user, passward);
	            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (username, password, email,address,contact) VALUES (?, ?, ?, ?, ? )");
	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);
	            preparedStatement.setString(3, email);
	            preparedStatement.setString(4, address);
	            preparedStatement.setString(5, contact);

	            int rowsInserted = preparedStatement.executeUpdate();
	            preparedStatement.close();
	            connection.close();

	            if (rowsInserted > 0) 
	            {
	            	response.setContentType("text/html");
	             	PrintWriter writer=response.getWriter();
	             	writer.println("<h1>Registered Information</h1>");
	             	writer.println("<h1>"+ username +"</h1>");
	             	writer.println("<h1>"+ password +"</h1>");
	             	writer.println("<h1>"+ email +"</h1>");
	             	writer.println("<h1>"+ address +"</h1>");
	             	writer.println("<h1>"+ contact +"</h1>");
	                writer.println("<h1>Registration Successful</h1>");
	            } else {
	            	  writer.println("<h1>Registration Failed</h1>");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	          
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	    }
	}


