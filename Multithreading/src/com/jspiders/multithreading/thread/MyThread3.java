package com.jspiders.multithreading.thread;

public class MyThread3 extends Thread
{
	@Override
	public void run() {
		System.out.println("Default thread name is: " +getName());
		System.out.println("Default priority of thread is: "+getPriority());
	}
}
