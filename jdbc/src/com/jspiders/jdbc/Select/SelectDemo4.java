package com.jspiders.jdbc.Select;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;



public class SelectDemo4
{
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static  FileInputStream file;
	private static Properties properties=new Properties();
	private static String driverPath="com.mysql.cj.jdbc.Driver";
	private static String dburl="jdbc:mysql://localhost:3306/sys?"+
			"user=root&password=root";
	
	private static String filePath="D:\\WEJA2\\jdbc\\src\\com\\jspiders\\jdbc\\Resources\\db_info.properties";
	private static String query="select * from emp";
	public static void main(String[] args) throws IOException
	{
		try
		{
			Class.forName(driverPath);
			
			file=new FileInputStream(filePath);
			properties.load(file);
			
			connection=DriverManager.getConnection(dburl);
			
			statement=connection.createStatement();
			
			resultSet=statement.executeQuery(query);
			
			while(resultSet.next())
			{
				System.out.println( resultSet.getString(1)+"||"
						+ resultSet.getString(2)+"||"
						+ resultSet.getString(3));
			}
		}
		catch(ClassNotFoundException |SQLException e)
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
				if(statement!=null)
				{
					statement.close();
				}
				if(resultSet!=null)
				{
					resultSet.close();
				}
				if(file!=null)
				{
					file.close();
				}
			}
		
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
