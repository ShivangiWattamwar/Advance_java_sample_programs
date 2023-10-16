package com.jspiders.JDBC.operation;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertJDBC 
{
	public static void main(String[] args) throws SQLException
	{
		//registered the driver class
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		//open connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja3?user=root&password=root");
		
		//create/prepared statement
		Statement statement=connection.createStatement();
		
		//execute the query
		statement.execute("INSERT INTO student VALUES(2,'shiv','shiv@gmail.com',21,25000)");
		
		//process the result
		System.out.println("Data inseted");
		
		//close the connection
		connection.close();
		statement.close();
		
		//de-registered the driver class
		DriverManager.deregisterDriver(driver);
		
	}
}
