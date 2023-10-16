package com.jspiders.serialization_and_deserialization;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Deserialization 
{
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		File file=new File("Student.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		Student student=(Student)objectInputStream.readObject();
		if(file.exists())
		{
			System.out.println(student);
			System.out.println("Objcet is fetched from the file");
			objectInputStream.close();
			fileInputStream.close();
		}
		else
		{
			System.out.println("File does not exists");
		}
	}
}
