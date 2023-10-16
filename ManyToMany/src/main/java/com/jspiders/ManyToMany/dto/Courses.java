package com.jspiders.ManyToMany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Courses {
	
	@Id
	private int id;
	private String name;
	private double fees;

}
