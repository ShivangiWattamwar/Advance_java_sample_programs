package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread5;

public class MyThread5Main 
{
	public static void main(String[] args) {
		
		MyThread5 myThread5=new MyThread5();
		myThread5.setName("5");
		myThread5.start();
	}
}
