package com.jspiders.car_studio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.car_studio.pojo.CarPOJO;
import com.jspiders.car_studio.repository.CarRepository;


@Service
public class CarService {
	
	@Autowired
	private CarRepository repository;

	public List<CarPOJO> findAllCars() {
		List <CarPOJO> cars=repository.findAllCars();
		return cars;
	}

	public CarPOJO addCar(String name, String model, String fuel_type, long price) {
		CarPOJO pojo=repository.addCars(name,model,fuel_type,price);
		return pojo;
	}

	public CarPOJO searchCar(int id) {
		CarPOJO pojo=repository.searchCar(id);
		return pojo;
	}

	public CarPOJO removeCar(int id) {
		CarPOJO pojo=repository.removeCar(id);
		return pojo;
	}

	public CarPOJO updateCar(int id, String name, String model, String fuel_type, long price) {
		CarPOJO pojo=repository.updateCar(id,name,model,fuel_type,price);
		return pojo;
	}

	
}
 