package com.jspiders.jdbc.object;

public class Student
{
	private int sid;
	private String name;
	private String email;
	private long contact;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public int getSid()
	{
		return sid;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", contact=" + contact + ", getName()="
				+ getName() + ", getEmail()=" + getEmail() + ", getContact()=" + getContact() + ", getSid()=" + getSid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
