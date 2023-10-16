package com.jspiders.designpatterns.main;
import com.jspiders.designpatterns.creational.Contact;
import com.jspiders.designpatterns.creational.ContactBuilder;

public class ContactMain 
{
	public static void main(String[] args) {
		Contact contact=new ContactBuilder().lastName("Musk").firstName("Elon").landlineNumber(1234567890)
				.getContact();
		System.out.println(contact);
	}
}
