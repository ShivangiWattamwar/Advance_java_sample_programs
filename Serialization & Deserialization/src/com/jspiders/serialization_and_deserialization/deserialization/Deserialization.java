package com.jspiders.serialization_and_deserialization.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspiders.serialization_and_deserialization.serialization.Student;

public class Deserialization 
{

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		File file=new File("student.txt");
		
		if(file.exists())
		{
			FileInputStream fileInputStream=new FileInputStream(file);
			
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			
			Student student=(Student) objectInputStream.readObject();
			
			System.out.println(student);
			
			System.out.println("Object is featched from the file.");
			
			objectInputStream.close();
			fileInputStream.close();
		}
		else
		{
			System.out.println("File does not exist.");
		}
		
	}
}
