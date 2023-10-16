package com.jspiders.designpattern.creational;

public class Contact 
{
	private String name;
	private String middleName;
	private String lastName;
	private String email;
	private long mobile;
	private String address;
	private int age;
	private String gender;
	

	public Contact(String name, String middleName, String lastName, String email, long mobile, String address, int age,
			String gender) {
		super();
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}
	

	public String toString() {
		return "Contact [name=" + name + ", middleName=" + middleName + ", lastName=" + lastName + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
