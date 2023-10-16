package com.jspider.cardekho_case_study.main;


import java.util.Scanner;

import com.jspider.cardekho_case_study.operation.CarOperation;

public class CarDekhoMenu {
	
	public static CarOperation operation=new CarOperation();
	public static boolean loop=true;
	public static void main(String args[]) {
		while(loop) {
		carDekhoMenu();
		}
		
	}
	private static void carDekhoMenu(){
		System.out.println("========MENU=======\n"
				+ "1. Add car details \n"
				+ "2. Search car details \n"
				+ "3. Update car details \n"
				+ "4. Remove car details \n"
				+ "5. Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice :");
		int ch=sc.nextInt();
		
		switch (ch)
		{
		
		case 1:	
			System.out.println("1 Add car details \n"
					+"2 Remove car details  \n"
					+"3 Go back to main menu\n"
					);
			System.out.println("Enter your choice");
			Scanner sc1=new Scanner(System.in);
			int ch1=sc1.nextInt();
			
			switch(ch1)
			{
			case 1:
				operation.addCar();
				break;
			case 2:
				operation.removeCar();
				break;
			case 3:
				carDekhoMenu();
				break;
			default:
				System.out.println("invalid choice");
				
			}
			break;
		
			
		case 2:
			
			System.out.println("1 Search car details by name \n"
					+"2 search car details by model  \n"
					+"3 search car details by fuel_type \n"
					);
			Scanner sc2=new Scanner(System.in);
			int ch2=sc2.nextInt();
			switch(ch2)
			{
			case 1:
				operation.searchCarByName();
				break;
			case 2:
				operation.searchCarByModel();
				break;
			case 3:
				operation.searchCarByFuel_type();
				break;
		
			}
			break;
		case 3:
			
			System.out.println("1 Update car details by name \n"
					+"2 Update car details by model \n"
					+"3 Update car details by fuel_type \n"
					+"4 Update car details by price");
			Scanner sc3=new Scanner(System.in);
			int ch3=sc3.nextInt();
			switch(ch3)
			{
			case 1:
				operation.updateCarByName();
				break;
			case 2:
				operation.updateCarByModel();
				break;
			case 3:
				operation.updateCarByFuel();
				break;
			case 4:
				operation.updateCarByPrice();
				break;
			}
			break;
		case 4:
			System.out.println("Remove car details ");
			operation.removeCar();
			break;
			
		case 5:
			System.out.println("Thank You...!!");
			loop=false;
			sc.close();	
			break;
			
		default:
			System.out.println("Please enter the valid input:");
			carDekhoMenu();
			break;
		}
	
	}

}

