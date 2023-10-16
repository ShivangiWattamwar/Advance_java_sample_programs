package com.jspiders.JDBC.operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class SelectJDBC
{
	
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) throws SQLException {
		
		try {
		
			connection=openConnection();
			statement=connection.createStatement();
			query="SELECT * FROM student";
			statement.execute(query);
			ResultSet resultSet=statement.getResultSet();
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+" "
						+resultSet.getString(2)+" "+ resultSet.getString(3)+" "+ resultSet.getInt(4)+" "+resultSet.getDouble(5));
			}
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		finally
		{
			closeConnection();
		}
	}
	
	private static Connection openConnection() throws SQLException, IOException, ClassNotFoundException
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
		if(resultSet!=null)
		{
			resultSet.close();
		}
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
