package com.jspiders.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee1
{
	@Id
	private int id1;
	private String name1;
	private String email1;
	private double salary1;
}
