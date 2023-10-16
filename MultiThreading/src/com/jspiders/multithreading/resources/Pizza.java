package com.jspiders.multithreading.resources;

public class Pizza {
	private int availablePizza;
	
	public synchronized void orderPizza(int orderedPizza)
	{
		System.out.println("Trying to order "+orderedPizza+" pizzas");
		if(availablePizza<orderedPizza)
		{
			System.out.println(orderedPizza+" pizza not available"+" please wait");
			try
			{
				this.wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		availablePizza-=orderedPizza;
		System.out.println(orderedPizza+" pizzas delivered");
		System.out.println(availablePizza+" pizzas available");
	}
	
	public synchronized void backPizza(int backedPizza)
	{
		System.out.println("Baking "+backedPizza+" pizzas");
		availablePizza+=backedPizza;
		System.out.println(backedPizza+" pizza backed");
		System.out.println(availablePizza+" pizza available");
		this.notify();
	}

}
