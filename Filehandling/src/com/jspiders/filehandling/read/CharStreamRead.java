package com.jspiders.filehandling.read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead 
{
	public static void main(String[] args) throws IOException {
		
		File file=new File("Demo.txt");
		if(file.exists())
		{
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
			System.out.println("Data featched from file using filereader()");
			fileReader.close();
			
			Scanner sc=new Scanner(System.in);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			System.out.println("Data featched from the file using scanner");
			sc.close();
		}
		else
		{
			System.out.println("File does not exist.");
		}
	}
}
