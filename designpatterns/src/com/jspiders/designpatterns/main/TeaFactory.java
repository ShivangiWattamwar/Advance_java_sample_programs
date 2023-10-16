package com.jspiders.designpatterns.main;
import com.jspiders.designpatterns.creational.Beverage;
import com.jspiders.designpatterns.creational.NormalTea;
import com.jspiders.designpatterns.creational.BlackTea;
import com.jspiders.designpatterns.creational.GreenTea;
import com.jspiders.designpatterns.creational.IceTea;
import java.util.Scanner;

public class TeaFactory 
{
	private static Beverage beverage;
	public static void main(String args[])
	{
		try 
		{
			factory().order();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static Beverage factory()
	{
		System.out.println("select tea to order");
		System.out.println("1. Normal Tea \n"+"2. Black Tea \n"+"3. Green Tea \n"+"4. Ice Tea");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			beverage=new NormalTea();
			break;
			
		case 2:
			beverage=new BlackTea();
			break;
			
		case 3:
			beverage=new GreenTea();
			break;
			
		case 4:
			beverage=new IceTea();
			break;
			
		default:
			System.out.println("Invalid choice");
			System.out.println("No tea ordered");
		}
		return beverage;
	}
}
