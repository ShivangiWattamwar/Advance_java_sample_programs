package com.jspiders.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspiders.springcoreannotation.beans.PersonBean;

@ComponentScan(basePackages ="com.jspiders.springcoreannotation")
public class PersonConfig
{
	@Bean
	public PersonBean getPerson()
	{
		return new PersonBean();
	}
}
