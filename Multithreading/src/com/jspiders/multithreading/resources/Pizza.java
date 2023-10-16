package com.jspiders.multithreading.resources;

public class Pizza
{
	private int availablePizza;
	public synchronized void orderPizza(int orderedPizza)
	{
		if(availablePizza<orderedPizza)
		{
			System.out.println("Wait for some time");
			
			try
			{
				this.wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			availablePizza-=orderedPizza;
			System.out.println(orderedPizza+" Pizza is ordered!!");
		}
	}
	public synchronized void backPizza(int backedPizza)
	{
		availablePizza+=backedPizza;
		System.out.println(backedPizza+" Pizza is backed!!");
		this.notify();
	}
}
