package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread4;

public class MyThread4Main 
{
	public static void main(String[] args) {
		
		MyThread4 myThread4=new MyThread4();
		myThread4.setName("Thread-4");
		myThread4.setPriority(1);
		myThread4.start();
	}
}
