package com.jspiders.designpattern.main;

import com.jspiders.designpattern.creational.Contact;
import com.jspiders.designpattern.creational.ContactBuilder;

public class ContactMain 
{
	public static void main(String[] args) {
		
		Contact contact=new ContactBuilder().name("Shivangi").lastName("Wattamwar").mobile(7620422104L).age(23).getContact();
		
		System.out.println(contact);
	}
}
