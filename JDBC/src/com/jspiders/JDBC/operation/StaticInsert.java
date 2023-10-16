package com.jspiders.JDBC.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class StaticInsert 
{		
		private static Driver driver;
		private static Connection connection;;
		private static Statement statement;
		private static String query;
		
		public static void main(String[] args) throws SQLException  {
			
			try
			{
				connection=openConnection();
				statement=connection.createStatement();
				
				//static query
				query="INSERT INTO student VALUES(5,'Shyam','shyam@gamil.com',30,40000)";
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
