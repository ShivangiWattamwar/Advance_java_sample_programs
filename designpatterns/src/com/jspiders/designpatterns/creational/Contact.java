package com.jspiders.designpatterns.creational;

public class Contact 
{
	private String firstName;
	private String middleName;
	private String lastName;
	private String nickName;
	private String email;
	private long mobileNumber;
	private long landlineNumber;
	private String address;
	private String gender;
	private int age;
	private String dob;	


	public Contact(String firstName, String middleName, String lastName, String nickName, String email,
			long mobileNumber, long landlineNumber, String address, String gender, int age, String dob) 
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.landlineNumber = landlineNumber;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
	}


	@Override

	public String toString() {
		return "Contact [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", nickName=" + nickName + ", email=" + email + ", mobileNumber=" + mobileNumber + ", landlineNumber="
				+ landlineNumber + ", address=" + address + ", gender=" + gender + ", age=" + age + ", dob=" + dob
				+ "]";
	}
	

}