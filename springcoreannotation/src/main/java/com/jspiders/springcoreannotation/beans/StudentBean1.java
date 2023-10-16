package com.jspiders.springcoreannotation.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean1 {
	private int id;
	private String name;
	private String email;
}
