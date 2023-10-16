package com.jspiders.springcoreannotation.config;
import org.springframework.context.annotation.Bean;
import com.jspiders.springcoreannotation.beans.StudentBean1;
public class StudentConfig1 
{
	@Bean("student2")
	public StudentBean1 getStudent1()
	{
		return new StudentBean1(2,"Karan","karan@gmail.com");
	}
}
