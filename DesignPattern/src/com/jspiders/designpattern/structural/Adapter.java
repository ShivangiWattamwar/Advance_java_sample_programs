package com.jspiders.designpattern.structural;

public class Adapter extends Employee implements Event
{
	public void womensDay(Adapter adapter)
	{
		adapter.setId(1);
		adapter.setName("Sarika");
		adapter.setEmail("sarika@gmail.com");
		System.out.println("cheif guest for the womensday is "+ adapter.getName());
	}

	
	public void mensDay(Adapter adapter) 
	{
		adapter.setId(1);
		adapter.setName("Rajkumar");
		adapter.setEmail("raj@gmail.com");
		System.out.println("cheif guest for the mensday is "+ adapter.getName());
		
	}
}
