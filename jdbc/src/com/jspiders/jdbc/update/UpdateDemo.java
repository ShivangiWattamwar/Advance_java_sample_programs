package com.jspiders.jdbc.update;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;



public class UpdateDemo
{
	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static  FileInputStream file;
	private static Properties properties=new Properties();
	private static String driverPath="com.mysql.cj.jdbc.Driver";
	private static String dburl="jdbc:mysql://localhost:3306/shiv?"+
			"user=root&password=root";
	
	private static String filePath="D:\\WEJA2\\jdbc\\src\\com\\jspiders\\jdbc\\Resources\\db_info.properties";
	private static String query;
	public static void main(String[] args) 
	{
		try
		{
			Class.forName(driverPath);
			
			file=new FileInputStream(filePath);
			properties.load(file);
			
			connection=DriverManager.getConnection(dburl);
			
			statement=connection.createStatement();
			
			query="update student set name='akbar', email='akbar@gmail.com' where s_id=3";
			
			
			result=statement.executeUpdate(query);
			
			if(result!=0)
			{
				System.out.println( result+" rows are affected");
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
				if(statement!=null)
				{
					statement.close();
				}

				if(file!=null)
				{
					file.close();
				}
			}
		
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}


