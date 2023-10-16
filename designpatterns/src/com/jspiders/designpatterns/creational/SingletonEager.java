package com.jspiders.designpatterns.creational;

public class SingletonEager 
{
	private static SingletonEager singletonEager=new SingletonEager();
	
	public SingletonEager()
	{
		System.out.println("Constructor accessed");
	}
	
	public static SingletonEager getObject()
	{
		return singletonEager;
		
	}
}
