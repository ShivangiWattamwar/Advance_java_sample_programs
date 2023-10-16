package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resources.Pizza;

public class Dominos extends Thread
{
	private Pizza pizza;
	public Dominos(Pizza piz)
	{
		this.pizza=piz;
	}
	public void run()
	{
		pizza.backPizza(5);
	}
}
