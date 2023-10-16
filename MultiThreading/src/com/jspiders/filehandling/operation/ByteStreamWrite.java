package com.jspiders.filehandling.operation;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class ByteStreamWrite 
{
	public static void main(String args[]) throws IOException
	{
		File file=new File("c:/users/shivangi/Demo.txt");
		if(file.exists())
		{
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(30);
			System.out.println("Data written to the file");
			fileOutputStream.close();
		}
		else
		{
			file.createNewFile();
			System.out.println("File is created");
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(30);
			System.out.println("Data written to the file");
			fileOutputStream.close();
			
		}
	}
}
