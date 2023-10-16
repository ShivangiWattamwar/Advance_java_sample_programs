package com.jspiders.multithreading.thread;
import com.jspiders.multithreading.resources.Pizza;
public class Friends extends Thread {
	private Pizza pi;
	
	public Friends(Pizza piz)
	{
		this.pi=piz;
	}
	public void run()
	{
		pi.orderPizza(5);
	}
}
