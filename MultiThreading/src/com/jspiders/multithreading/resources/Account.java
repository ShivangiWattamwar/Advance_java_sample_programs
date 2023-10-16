package com.jspiders.multithreading.resources;

public class Account {
	private int Balance;
	public Account(int balance)
	{
		this.Balance=balance;
	}
	public int checkBalance()
	{
		return Balance;
	}
	public synchronized void deposite(int amount)
	{
		System.out.println("Trying to deposite:"+amount+"Rs.");
		Balance+=amount;
		System.out.println("Deposite successful..!!");
		System.out.println("Account Balance"+checkBalance());
	}
	public synchronized void withdraw(int amount)
	{
		System.out.println("Trying to withdraw:"+amount+"Rs.");
		if(Balance>=amount) 
		{
			Balance-=amount;
			System.out.println("Withdraw successful..!!");
			System.out.println("Account Balance"+checkBalance());
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}
