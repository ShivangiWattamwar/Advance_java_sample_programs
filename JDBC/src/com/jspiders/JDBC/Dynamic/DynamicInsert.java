package com.jspiders.JDBC.Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DynamicInsert {
	
	private static Driver driver;
	private static Connection connection;;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) throws SQLException  {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student name");
		String name=sc.nextLine();
		
		System.out.println("Enter student email");
		String email=sc.nextLine();
		
		System.out.println("Enter student age");
		int age=sc.nextInt();
		
		System.out.println("Enter student fees");
		double fees=sc.nextDouble();
		
		sc.close();
		
		try
		{
			connection=openConnection();
			statement=connection.createStatement();
			
			//static query
			query="INSERT INTO student VALUES("+ id +",'"+ name +"','"+ email +"',"+ age +","+ fees +")";
			int row=statement.executeUpdate(query);
			System.out.println(row +" row(s) affected");
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		
	}

	private static Connection openConnection() throws SQLException {
		driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","root");
	}
	private static void closeConnection() throws SQLException
	{
		if(statement!=null)
		{
			statement.close();
		}
		if(connection!=null)
		{
			connection.close();
		}
		DriverManager.deregisterDriver(driver);
	}

}

