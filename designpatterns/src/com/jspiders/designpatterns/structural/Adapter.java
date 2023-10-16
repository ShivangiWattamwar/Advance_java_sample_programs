package com.jspiders.designpatterns.structural;

public class Adapter extends Employee implements Event 
{
	public void womensDay(Adapter adapter)
	{
		adapter.setId(1);
		adapter.setName("Radha");
		adapter.setEmail("radha@gmail.com");
		
		System.out.println("chief guest for the womens day is "+adapter.getName());
	}
	
	public void mensDay(Adapter adapter)
	{
		adapter.setId(2);
		adapter.setName("Krishna");
		adapter.setEmail("krishna@gmail.com");
		
		System.out.println("chief guest for the mens day is "+adapter.getName());
	}
	
}
