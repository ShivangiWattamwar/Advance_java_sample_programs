package com.jspiders.springcoreannotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class AadharBean 
{
	@Value("1")
	private int id;
	
	@Value("587945612345")
	private long aadharNo;
}
