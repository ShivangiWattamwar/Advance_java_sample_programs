package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resources.Account;

public class Wife extends Thread
{
	private Account account;
	public Wife(Account acc)
	{
		this.account=acc;
	}
	public void run()
	{
		account.deposite(2000);
		account.withdraw(5000);
	}

}
