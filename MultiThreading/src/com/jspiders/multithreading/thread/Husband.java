package com.jspiders.multithreading.thread;
import com.jspiders.multithreading.resources.Account;
public class Husband extends Thread{
	private Account account;
	public Husband(Account ac)
	{
		this.account=ac;
	}
	public void run()
	{
		account.deposite(5000);
		account.withdraw(2000);
	}	
}
