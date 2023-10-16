package com.jspiders.designpatterns.main;

import java.util.Scanner;

import com.jspiders.designpatterns.creational.BmwCar;
import com.jspiders.designpatterns.creational.Car;
import com.jspiders.designpatterns.creational.EgnisCar;
import com.jspiders.designpatterns.creational.ErticaCar;
import com.jspiders.designpatterns.creational.NexonCar;
import com.jspiders.designpatterns.creational.SwiftCar;

public class CarStudio 
{
	private static Car car;
	
	public static void main(String[] args) {
		
		try
		{
			factory().order();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	private static Car factory() {
		System.out.println("Select car to order.");
		System.out.println("=======================");
		System.out.println("1.Bmw car \n"+"2.Swift car \n"+"3.Nexon car \n"+"4.Ertica car \n"+"5.Egnis car \n");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			car=new BmwCar();
			break;
		
		case 2:
			car=new SwiftCar();
			break;
			
		case 3:
			car=new NexonCar();
			break;
		
		case 4:
			car=new ErticaCar();
			break;
			
		case 5:
			car=new EgnisCar();
			break;
			
		default:
			System.out.println("Invalid choice");
			System.out.println("No car ordered");
		}
		return car;
	}
}
