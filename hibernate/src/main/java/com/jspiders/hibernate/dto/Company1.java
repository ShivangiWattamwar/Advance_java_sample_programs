package com.jspiders.hibernate.dto;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Data;

@Data
@Entity
public class Company1 
{
	@Id
	private int id1;
	private String name1;
	private String address1;
	private String email1;
	
	@OneToMany
	private List<Employee1>employees;
}
