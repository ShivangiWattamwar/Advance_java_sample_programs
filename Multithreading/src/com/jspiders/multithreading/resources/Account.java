package com.jspiders.multithreading.resources;

public class Account 
{
	private int Balance;
	public Account(int balance)
	{
		this.Balance=balance;
	}
	
	public int checkBalance()
	{
		return Balance;
	}
	public synchronized void  deposite(int amount)
	{
		Balance+=amount;
		System.out.println("Deposite Successfully!!");
		System.out.println("Available balance "+ checkBalance());
	}
	public synchronized void  withdraw(int amount)
	{
		if(Balance>=amount)
		{
			Balance-=amount;
			System.out.println("Withdraw successfully!!");
			System.out.println("Available balance "+checkBalance());
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
}
