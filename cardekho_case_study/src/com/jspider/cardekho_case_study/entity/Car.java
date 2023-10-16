package com.jspider.cardekho_case_study.entity;

public class Car {
	private int Car_id;
	private String Name;
	private String Model;
	private String Fuel_type;
	private double Price;
	
	
	//getter method and setter method
	public int getCar_id() {
		return Car_id;
	}
	public void setCar_id(int car_id) {
		Car_id = car_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getFuel_type() {
		return Fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		Fuel_type = fuel_type;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}

}
