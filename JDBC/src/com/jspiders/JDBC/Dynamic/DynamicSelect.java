package com.jspiders.JDBC.Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicSelect 
{
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id");
		int id=sc.nextInt();
		try {
			connection=openConnection();
			query="SELECT * FROM student WHERE id=?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+" "
						+resultSet.getString(2)+" "+ resultSet.getString(3)+" "+ resultSet.getInt(4)+" "+resultSet.getDouble(5));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			closeConnection();
		}
	}
	private static Connection openConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3","root","root");
	}
	
	private static void closeConnection() throws SQLException
	{
		if(resultSet!=null)
		{
			resultSet.close();
		}
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
