package com.jspiders.designpatterns.creational;

public class ContactBuilder 
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
	
	
	public ContactBuilder firstName(String fn)
	{
		this.firstName=fn;
		return this;
	}
	public ContactBuilder middleName(String mn)
	{
		this.middleName=mn;
		return this;
	}
	public ContactBuilder lastName(String ln)
	{
		this.lastName=ln;
		return this;
	}
	public ContactBuilder nickName(String nn)
	{
		this.nickName=nn;
		return this;
	}
	public ContactBuilder email(String em)
	{
		this.email=em;
		return this;
	}
	public ContactBuilder mobileNumber(long mob)
	{
		this.mobileNumber=mob;
		return this;
	}
	public ContactBuilder landlineNumber(long lno)
	{
		this.landlineNumber=lno;
		return this;
	}
	public ContactBuilder address(String ad)
	{
		this.address=ad;
		return this;
	}
	public ContactBuilder gender(String ge)
	{
		this.gender=ge;
		return this;
	}
	public ContactBuilder age(int ag)
	{
		this.age=ag;
		return this;
	}
	public ContactBuilder bod(String db)
	{
		this.dob=db;
		return this;
	}
	
	public Contact getContact()
	{
		Contact contact=new Contact(firstName,middleName,lastName,nickName,email,mobileNumber,
				landlineNumber,address,gender,age,dob);
		return contact;
	}
	
	
}
