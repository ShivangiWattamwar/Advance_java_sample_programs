package com.jspiders.multithreading.main;
import com.jspiders.multithreading.resources.Pizza;
import com.jspiders.multithreading.thread.Friends;
import com.jspiders.multithreading.thread.Dominos;
public class PizzaMain 
{
	public static void main(String args[]) 
	{
		Pizza pizza=new Pizza();
		Friends friends=new Friends(pizza);
		Dominos dominos=new Dominos(pizza);
		
		friends.start();
		dominos.start();
	}

}