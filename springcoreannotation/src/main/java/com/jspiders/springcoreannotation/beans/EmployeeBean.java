package com.jspiders.springcoreannotation.beans;
import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean 

{
	@Value("1")
	private int id;
	
	@Value("Amol")
	private String name;
	
	@Value("amol@gmail.com")
	private String email;
	
	@Value("Wakad")
	private String address;
}
