package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resources.Pizza;

public class Friends extends Thread
{
	private Pizza pizza;
	public Friends(Pizza piz)
	{
		this.pizza=piz;
	}
	public void run()
	{
		pizza.orderPizza(5);
	}
}
