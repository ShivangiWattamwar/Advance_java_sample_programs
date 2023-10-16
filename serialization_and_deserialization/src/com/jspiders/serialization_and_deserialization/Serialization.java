package com.jspiders.serialization_and_deserialization;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization
{
	public static void main(String srgs[]) throws IOException
	{
		File file=new File("Student.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new Student(1,"Ram","Ram@gmail.com",25));
		if (file.exists())
		{			
			System.out.println("Object is written to the file");
			objectOutputStream.close();
			fileOutputStream.close();
		}
		else
		{	
			System.out.println("Object is written to the file");
			objectOutputStream.close();
			fileOutputStream.close();
		}
	}
}
