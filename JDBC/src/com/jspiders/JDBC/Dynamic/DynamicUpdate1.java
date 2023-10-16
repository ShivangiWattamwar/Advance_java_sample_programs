package com.jspiders.JDBC.Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicUpdate1 {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query1;
	
	
	public static void main(String[] args) throws SQLException 
	{
		Scanner sc=new Scanner(System.in);
		try {
			connection=openConnection();
			query1="SELECT * FROM student";
			preparedStatement=connection.prepareStatement(query1);
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+" "
						+resultSet.getString(2)+" "+ resultSet.getString(3)+" "+ resultSet.getInt(4)+" "+resultSet.getDouble(5));
			} 
			System.out.println("\n**********************************************");
			System.out.println("Enter student id which you have to updated :");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter your choice:");
			System.out.println("1. Name"+" 2. Email"+" 3. Age"+" 4. Fees");
			
			int ch=sc.nextInt();
			String name;
			String email;
			int age;
			double fees;
			switch(ch)
			{
			case 1:
				System.out.println("Enter student name");
				name=sc.nextLine();
				String query2="UPDATE student set name=?";
				preparedStatement=connection.prepareStatement(query2);
				preparedStatement.setString(1, name);
				int row=preparedStatement.executeUpdate();
				System.out.println(row+" row affected!!");
				
				break;
				
			case 2:
				System.out.println("Enter student email");
			    email=sc.nextLine();
			    String query3="UPDATE student set email=? ";
				preparedStatement=connection.prepareStatement(query3);
				preparedStatement.setString(1,email);
				int row1=preparedStatement.executeUpdate();
				System.out.println(row1+" row affected!!");
				
				break;
				
			case 3:
				System.out.println("Enter student age");
				age=sc.nextInt();
				String query4="UPDATE student set age=? ";
				preparedStatement=connection.prepareStatement(query4);
				preparedStatement.setInt(1, age);
				int row2=preparedStatement.executeUpdate();
				System.out.println(row2+" row affected!!");
				
				break;
				
			case 4:
				System.out.println("Enter student fees");
				fees=sc.nextDouble();
				String query5="UPDATE student set fees=? ";
				preparedStatement=connection.prepareStatement(query5);
				preparedStatement.setDouble(4, fees);
				
				int row3=preparedStatement.executeUpdate();
				System.out.println(row3+" row affected!!");
				
				break;
				
			default:
				System.out.println("Invalid choice");
			
			sc.close();
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
