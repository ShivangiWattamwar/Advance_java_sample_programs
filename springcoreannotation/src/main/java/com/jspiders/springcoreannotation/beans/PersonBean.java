package com.jspiders.springcoreannotation.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class PersonBean 
{
	@Value("1")
	private int id;
	
	@Value("Nikhil")
	private String name;
	
	@Autowired
	private AadharBean aadhar;
}
