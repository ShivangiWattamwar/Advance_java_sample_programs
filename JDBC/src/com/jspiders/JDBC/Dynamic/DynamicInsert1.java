package com.jspiders.JDBC.Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert1 
{
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name");
		String name=sc.nextLine();
		System.out.println("Enter student email");
		String email=sc.nextLine();
		System.out.println("Enter student age");
		int age=sc.nextInt();
		System.out.println("Enter student fees");
		double fees=sc.nextDouble();
		sc.close();
		
		try {
			connection=openConnection();
			query="INSERT INTO student VALUES(?,?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3,email);
			preparedStatement.setInt(4, age);
			preparedStatement.setDouble(5, fees);
			
			int row=preparedStatement.executeUpdate();
			System.out.println(row+" row(s) affected!!");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			closeConnection();
		}
	}
	private static Connection openConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","root");
	}
	
	private static void closeConnection() throws SQLException
	{
		if(preparedStatement !=null)
		{
			preparedStatement.close();
		}
		if(connection!=null)
		{
			connection.close();
		}
	}
}
