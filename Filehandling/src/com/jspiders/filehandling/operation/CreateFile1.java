package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class CreateFile1 
{
	public static void main(String[] args) throws IOException {
		
		File file=new File("Demo.txt");
		if(file.exists())
		{
			System.out.println("File already exist.");
		}
		else
		{
			file.createNewFile();
			System.out.println("File is created!!");
		}
	}
}
