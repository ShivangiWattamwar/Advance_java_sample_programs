package com.jspiders.filehandling.operation;

import java.io.*;

public class CreateFileDemo3
{
	public static void main(String[] args) {
		
		File file=new File("c:/users/shivangi/Demo.txt");
		if(file.exists())
		{
			System.out.println("File is already exist");
		}
		else
		{
		try
		{
			file.createNewFile();
			System.out.println("File is created");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("File not created");
		}
		}
	}
}