package com.jspider.cardekho_case_study.operation;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.jspider.cardekho_case_study.entity.Car;


public class CarOperation
{
	private List<Car> cars=new ArrayList<Car>();
	
	public void addCar()
	{
		System.out.println("How many car you want to add?");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		for(int i=1;i<=ch;i++)
		{
			Car car=new Car();
			System.out.println("enter car id:");
			car.setCar_id(sc.nextInt());
			System.out.println("enter car name:");
			car.setName(sc.next());
			System.out.println("enter car model:");
			car.setModel(sc.next());
			System.out.println("enter car fuel_type:");
			car.setFuel_type(sc.next());
			System.out.println("enter car price:");
			car.setPrice(sc.nextDouble());
			
			cars.add(car);
			System.out.print("\n\n"+ car.getName()+" added successfully....!!\n");
		}
		getAllCarDetails();
	}
	
	public void getAllCarDetails()
	{
		if(cars.isEmpty())
		{
			System.out.println("No car found");
		}
		else
		{
			System.out.print("Total number of cars:"+cars.size()+"\n");
			
			System.out.println("Car_id \t"+"Name \t"+"Model \t"+
			"Fuel_type  "+"Price");
			System.out.println("==========================================");
			
			for(Car car:cars)
			{
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
			}
		}
	}
	public void searchCarByName()
	{
		if(cars.isEmpty())
		{
			System.out.println("car not found");
		}
		else
		{
			System.out.println("enter car name");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			List <Car>allCars=new ArrayList<Car>();
			
			for(Car car:cars)
			{
				if(car.getName().equalsIgnoreCase(name))
				{
					allCars.add(car);
					System.out.println("Car_id\t"+"Name\t"+"Model\t"+
							"Fuel_type\t"+"Price\n");
					System.out.println("==========================================");
					System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
				}
				
			}
			
		}
		
	}
	public void searchCarByModel()
	{

		if(cars.isEmpty())
		{
			System.out.println("car not found");
		}
		else
		{
			System.out.println("enter car model");
			Scanner sc=new Scanner(System.in);
			String model=sc.next();
			List <Car>allCars=new ArrayList<Car>();
			
			for(Car car:cars)
			{
				if(car.getModel().equalsIgnoreCase(model))
				{
					allCars.add(car);
					System.out.println("Car_id\t"+"Name\t"+"Model\t"+
							"Fuel_type\t"+"Price\n");
					System.out.println("==========================================");
					System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
				}
			}
			
		}
		
	}
	public void searchCarByFuel_type()
	{

		if(cars.isEmpty())
		{
			System.out.println("car not found");
		}
		else
		{
			System.out.println("enter car fuel_type");
			Scanner sc=new Scanner(System.in);
			String fuel=sc.next();
			List <Car>allCars=new ArrayList<Car>();
			
			for(Car car:cars)
			{
				if(car.getFuel_type().equalsIgnoreCase(fuel))
				{
					allCars.add(car);
					System.out.println("Car_id\t"+"Name\t"+"Model\t"+
							"Fuel_type\t"+"Price\n");
					System.out.println("==========================================");
					System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
				}
			}
		
		}
		
	}
	@SuppressWarnings("unlikely-arg-type")
	
	public void removeCar()
	{
		getAllCarDetails();
		if(cars.isEmpty()==false)
		{
			Car car1=null;
			
			System.out.println("enter car id to remove");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			for(Car car:cars)
			{
				if(car.getCar_id()==ch)
				{
					cars.remove(ch);
				}
				
			}
			System.out.println("removed successfully.....!!");
			getAllCarDetails();
		}
		else
		{
			System.out.println("data not found");
		}
		
	}
	public void updateCarByName()
	{
		getAllCarDetails();
		if(cars.isEmpty())
		{
			System.out.println("car not found");
		}
		else
		{
			System.out.println("enter car name which you want to update");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			
			
			
			
			for(Car car:cars)
			{
				if(car.getName().equalsIgnoreCase(name))
				{
					
					System.out.println("enter car name");
					Scanner sc1=new Scanner(System.in);
					String name1=sc1.next();
					car.setName(name1);
					System.out.println("car name updated...!!");
					System.out.println("Car_id\t"+"Name\t"+"Model\t"+
							"Fuel_type\t"+"Price\n");
					System.out.println("==========================================");
					System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
				}
			}
		}
	}
	
	
	public void updateCarByModel()
	{
		getAllCarDetails();
		if(cars.isEmpty())
		{
			System.out.println("car not found");
		}
		else
		{
			System.out.println("enter car model which you want to update");
			Scanner sc=new Scanner(System.in);
			String model=sc.next();
			
			
			
			
			for(Car car:cars)
			{
				if(car.getModel().equalsIgnoreCase(model))
				{
					
					System.out.println("enter car model");
					Scanner sc2=new Scanner(System.in);
					String model1=sc2.next();
					car.setModel(model1);
					System.out.println("car model updated...!!");
					System.out.println("Car_id\t"+"Name\t"+"Model\t"+
							"Fuel_type\t"+"Price\n");
					System.out.println("==========================================");
					System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
				}
			}
		}
	}
	
	
	public void updateCarByFuel()
	{
		getAllCarDetails();
		if(cars.isEmpty())
		{
			System.out.println("car not found");
		}
		else
		{
			System.out.println("enter car fuel type which you want to update");
			Scanner sc=new Scanner(System.in);
			String fuel=sc.next();
			
			
			
			
			for(Car car:cars)
			{
				
			 if(car.getFuel_type().equalsIgnoreCase(fuel))
				{
					
					System.out.println("enter car fuel_type");
					Scanner sc3=new Scanner(System.in);
					String fuel1=sc3.next();
					car.setFuel_type(fuel1);
					System.out.println("car fuel type updated...!!");
					System.out.println("Car_id\t"+"Name\t"+"Model\t"+
							"Fuel_type\t"+"Price\n");
					System.out.println("==========================================");
					System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
				}
			}
		}
	}
					
			
	public void updateCarByPrice()
	{
		getAllCarDetails();
		if(cars.isEmpty())
		{
			System.out.println("car not found");
		}
		else
		{
			System.out.println("enter car price which you want to update");
			Scanner sc=new Scanner(System.in);
			double cost=sc.nextDouble();
			
			
			
			for(Car car:cars)
			{
			 if(car.getPrice()==(cost))
				{
					
					System.out.println("enter car price");
					Scanner sc4=new Scanner(System.in);
					double cost1=sc4.nextDouble();
					car.setPrice(cost1);
					System.out.println("car price updated...!!");
					System.out.println("Car_id\t"+"Name\t"+"Model\t"+
							"Fuel_type\t"+"Price\n");
					System.out.println("==========================================");
					System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getFuel_type()+"\t"+car.getPrice());
					
				}
			}
			
			
		}
		
	}
	
}
