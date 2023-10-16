package com.jspiders.springcoreannotation.main;
import com.jspiders.springcoreannotation.App;
import com.jspiders.springcoreannotation.beans.EmployeeBean;
import com.jspiders.springcoreannotation.config.EmployeeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain 
{
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		EmployeeBean employee1=context.getBean(EmployeeBean.class);
		
		System.out.println(employee1);
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
