package com.jspiders.filehandling.operation;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class ByteStreamReader 
{
	public static void main(String args[]) throws IOException
	{
		File file=new File("c:/users/shivangi/Demo.txt");
		if(file.exists())
		{
			FileInputStream fileInputStream=new FileInputStream(file);
			System.out.println(fileInputStream.read());
			System.out.println("Data fetch from the file");
			fileInputStream.close();
		}
		else
		{
			System.out.println("File does not exists");
		}
	}
}
