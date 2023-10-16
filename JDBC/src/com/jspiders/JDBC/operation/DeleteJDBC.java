package com.jspiders.JDBC.operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DeleteJDBC
{
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) throws SQLException {
		
		try {
			
			connection=openConnection();
			statement=connection.createStatement();
			query=("DELETE FROM student WHERE id=6");
			int result = statement.executeUpdate(query);
			System.out.println(result+" row is affected!!");	
			
		}
		catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		finally
		{
			closeConnection();
		}
	}
	private static Connection openConnection() throws ClassNotFoundException, IOException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		File file=new File("D:/WEJA3/db_info.txt");
		FileReader fileReader=new FileReader(file);
		Properties properties=new Properties();
		properties.load(fileReader);
		return DriverManager.getConnection(properties.getProperty("url"),properties);
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
	}
	
}