package com.jspiders.multithreading.thread;
import com.jspiders.multithreading.resources.Pizza;
public class Dominos extends Thread {
	private Pizza pi;
	public Dominos(Pizza piz)
	{
		this.pi=piz;
	}
	public void run()
	{
		pi.backPizza(5);
	}

}
