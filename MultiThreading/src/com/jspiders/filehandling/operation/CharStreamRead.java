package com.jspiders.filehandling.operation;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class CharStreamRead 
{
	public static void main(String args[]) throws IOException
		{
			File file=new File("c:/users/shivangi/Demo.txt");
			if(file.exists())
			{
				FileReader fileReader=new FileReader(file);
				System.out.println(fileReader.read());
				System.out.println("Data fetch from the file using filereader");
				fileReader.close();
				
				Scanner sc=new Scanner(file);
				while(sc.hasNextLine())
				{
					System.out.println(sc.nextLine());
				}
				System.out.println("Data fetch from the file using scanner");
				sc.close();
			}
			else
			{
				System.out.println("File does not exists");
			}
		}
}
