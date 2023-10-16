package com.jspiders.multithreading.thread;

public class MyThread4 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Name of thread is: "+getName());
		System.out.println("Priority of thread is: "+getPriority());
	}
}
