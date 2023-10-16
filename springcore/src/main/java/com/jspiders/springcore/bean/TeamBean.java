package com.jspiders.springcore.bean;
import java.util.List;
import lombok.Data;

@Data
public class TeamBean 
{
	int id;
	String name;
	String country;
	List<PlayerBean>players;
}
