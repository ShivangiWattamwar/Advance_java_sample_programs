package com.jspiders.multithreading.thread;

public class MyThread5 extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				stop();
			}
			System.out.println(getName()+" is now running");
		}
	}
}