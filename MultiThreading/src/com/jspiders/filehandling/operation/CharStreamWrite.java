package com.jspiders.filehandling.operation;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class CharStreamWrite 
{
	public static void main(String args[]) throws IOException
	{
		File file=new File("c:/users/shivangi/Demo.txt");
		if(file.exists())
		{
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("Data from the java program");
			System.out.println("Data written to the file");
			fileWriter.close();
		}
		else
		{
			file.createNewFile();
			System.out.println("file is created");
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("Data from the java program");
			System.out.println("Data written to the file");
			fileWriter.close();
		}
	}
}
