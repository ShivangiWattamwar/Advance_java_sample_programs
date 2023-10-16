package com.jspiders.jdbc.callable;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;

public class CallableDemo1 
{
		private static Connection connection;
		private static CallableStatement callableStatement;
		private static ResultSet resultSet;
		private static String driverPath="com.mysql.cj.jdbc.Driver";
		private static String dburl="jdbc:mysql://localhost:3306/shiv?";
		private static String user="root";
		private static String password="root";
		private static String query="Call proc1()";
		
		public static void main(String[] args) 
		{
			try
			{
				Class.forName(driverPath);
				connection=DriverManager.getConnection(dburl,user,password);
				callableStatement=connection.prepareCall(query);
				resultSet=callableStatement.executeQuery();
				
				while(resultSet.next())
				{
					System.out.println(resultSet.getString(1)+"|"+ resultSet.getString(2)+"|"+resultSet.getString(3)+"|"+resultSet.getString(4)+"|");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(connection!=null)
					{
						connection.close();
					}
					if(callableStatement!=null)
					{
						callableStatement.close();
					}
					if(resultSet!=null)
					{
						resultSet.close();
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}					
		}	
}
