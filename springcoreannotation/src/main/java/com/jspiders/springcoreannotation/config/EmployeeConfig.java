package com.jspiders.springcoreannotation.config;
import org.springframework.context.annotation.Bean;
import com.jspiders.springcoreannotation.beans.EmployeeBean;

public class EmployeeConfig 
{
	@Bean
	public EmployeeBean getEmployee()
	{
		return new EmployeeBean();
	}
}
