package com.jspiders.designpattern.main;

import com.jspiders.designpattern.structural.Adapter;

public class AdapterMain 
{
	public static void main(String[] args) {
		
		Adapter adapter=new Adapter();
		adapter.womensDay(adapter);
		adapter.mensDay(adapter);
	}
}
