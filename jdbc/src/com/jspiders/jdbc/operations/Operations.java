package com.jspiders.jdbc.operations;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Operations {
	private static Statement statement;
	private static Connection connection;
	private static int result;
	private static  ResultSet resultset;
	private static FileInputStream file;
	private static String filepath="D:\\WEJA2\\jdbc\\src\\com\\jspiders\\jdbc\\Resources\\db_info.properties";
	private static String query;
	private static Properties properties = new Properties();
	
	public static void openConnection()
	{
		try {
			file = new FileInputStream(filepath);
			properties.load(file);
			
			Class.forName(properties.getProperty("driverPath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			
			statement =connection.createStatement();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void closeConnection()
	{
		try {
		
			
			if(connection!=null)
			{
				connection.close();
			}
			if(statement!=null)
			{
				statement.close();
			}
			if(resultset!=null)
			{
				resultset.close();
			}
			if(file!=null)
			{
				file.close();
			}
			if(result!=0)
			{
				result=0;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		try {
		
			
		openConnection();
			
		
    		//1.create table:
			query = "create table emp(Empno int (10),Ename varchar (10), job varchar (10),mgr int (10),Hiredate varchar (10), sal int (10),comm int (10))";
			result = statement.executeUpdate(query);
			
			if(result!=1)
			{
				System.out.println(result +"row(s) affected");
		}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		
			try {
				
				
			// 2.insert Records
		    openConnection();
			
			
		    Scanner scanner = new Scanner(System.in);
			for(int i=1;i<=14;i++)
			{
			
			System.out.println("Enter Empno:");
			int Empno= scanner.nextInt();
			
			System.out.println("Enter Ename:");
			String Ename= scanner.next();
			
      		System.out.println("Enter Job:");
			String job= scanner.next();
			
			System.out.println("Enter MGR:");
    		String mgr= scanner.next();
			
			System.out.println("Enter HireDate:");
			String Hiredate= scanner.next();
			
			System.out.println("Enter sal:");
			int sal= scanner.nextInt();
			
			System.out.println("Enter comm:");
			int comm= scanner.nextInt();
			
			
			query = "insert into emp values (" + Empno + ", " + "\'" + Ename +"\' ,"+"\' "+ job +"\' ,"+ mgr +", " + "\'"+ Hiredate +"\' ,"+ sal +", "+ comm + ")";
			result = result+statement.executeUpdate(query);
			
			}
			
			System.out.println("Query OK!..."+ result +"row(s) affected");
			
			
			}
			
			catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
			
			// 3.Display Records
			try {
				
			    openConnection();
			    
			    query ="select * from emp";
				
				resultset = statement.executeQuery(query);
				
				while(resultset.next())
				{
					System.out.println(resultset.getString(1)+"|"
							          +resultset.getString(2)+"|"
							          +resultset.getString(3)+"|"
							          +resultset.getString(4)+"|"
							          +resultset.getString(5)+"|"
							          +resultset.getString(6)+"|"
							          +resultset.getString(7));
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				closeConnection();
			}
			
			
			// 4.Update Records:
			
			try {
			openConnection();
			
			query = "update emp set ename='isha',job='sales' where empno in (1) ";
			result=statement.executeUpdate(query);
			
			query = "update emp set ename='pinkyy' where empno in (2) ";
			result=result+statement.executeUpdate(query);
			
			
			
    		
    		if(result!=0)
    		{
    			System.out.println(result + "row(s) affected");
    		}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				closeConnection();
			}
			
			// 5.Display Records
			try {
				
			    openConnection();
			    
			    query ="select * from emp";
				
				resultset = statement.executeQuery(query);
				
				while(resultset.next())
				{
					System.out.println(resultset.getString(1)+"|"
							          +resultset.getString(2)+"|"
							          +resultset.getString(3)+"|"
							          +resultset.getString(4)+"|"
							          +resultset.getString(5)+"|"
							          +resultset.getString(6)+"|"
							          +resultset.getString(7));
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				closeConnection();
			}
			
         //   6.Delete Records
			try {
				openConnection();
				
				query ="delete from emp where empno in (4,5,6)";
				
				 result=statement.executeUpdate(query);
		    		
		    		if(result!=0)
		    		{
		    			System.out.println(result + "row(s) affected");
		    		}
				
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
		closeConnection();
			}
			
			// 7.Display Records
						try {
							
						    openConnection();
						    
						    query ="select * from emp";
							
							resultset = statement.executeQuery(query);
							
							while(resultset.next())
							{
								System.out.println(resultset.getString(1)+"|"
										          +resultset.getString(2)+"|"
										          +resultset.getString(3)+"|"
										          +resultset.getString(4)+"|"
										          +resultset.getString(5)+"|"
										          +resultset.getString(6)+"|"
										          +resultset.getString(7));
							}
							
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						finally {
							closeConnection();
						}
			
			
			
		
	
		
	}
}






