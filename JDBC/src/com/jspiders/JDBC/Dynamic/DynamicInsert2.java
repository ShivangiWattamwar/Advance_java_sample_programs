package com.jspiders.JDBC.Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert2 
{
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			
			connection=openConnection();
			query="INSERT INTO student VALUES(?,?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			
			System.out.println("Enter how many records you want to insert: ");
			int num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
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
				
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, email);
				preparedStatement.setInt(4, age);
				preparedStatement.setDouble(5, fees);
				preparedStatement.addBatch();
				
			}
			sc.close();
			int res[]=preparedStatement.executeBatch();
			System.out.println(res.length+" row(s) affected!!");
		} 
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				closeConnection();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	private static Connection openConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3", "root", "root");
	}
	
	private static void closeConnection() throws SQLException
	{
		if(preparedStatement!=null)
		{
			preparedStatement.close();
		}
		if(connection!=null)
		{
			connection.close();
		}
	}
}
