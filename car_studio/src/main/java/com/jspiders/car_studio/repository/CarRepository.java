package com.jspiders.car_studio.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jspiders.car_studio.pojo.CarPOJO;

@Repository
public class CarRepository {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Query query;
	
	private static void openConnection()
	{
		factory=Persistence.createEntityManagerFactory("car");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	public static void closeConnection()
	{
		if(factory!=null)
		{
			factory.close();
		}
		
		if(manager!=null)
		{
			manager.close();
		}
		if(transaction!=null)
		{
			if(transaction.isActive())
			{
				transaction.rollback();
			}
		}
	}

	public List<CarPOJO> findAllCars() {
		openConnection();
		transaction.begin();
		String jpql="from CarPOJO";
		query=manager.createQuery(jpql);
		List<CarPOJO> cars=query.getResultList();
		transaction.commit();
		closeConnection();
		return cars;
	}

	public CarPOJO addCars(String name, String model, String fuel_type, long price) {
		openConnection();
		transaction.begin();
		
		CarPOJO pojo=new CarPOJO();
		pojo.setName(name);
		pojo.setModel(model);
		pojo.setFuel_type(fuel_type);
		pojo.setPrice(price);
		
		manager.persist(pojo);
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public CarPOJO searchCar(int id) {
		openConnection();
		transaction.begin();
		
		CarPOJO pojo=manager.find(CarPOJO.class,id);
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public CarPOJO removeCar(int id) {
		openConnection();
		transaction.begin();
		
		CarPOJO pojo=manager.find(CarPOJO.class, id);
		if(pojo!=null)
		{
			manager.remove(pojo);
		}
		
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public CarPOJO updateCar(int id, String name, String model, String fuel_type, long price) {
		openConnection();
		transaction.begin();
		
		CarPOJO pojo = manager.find(CarPOJO.class, id);
		pojo.setName(name);
		pojo.setPrice(price);
		pojo.setModel(model);
		pojo.setFuel_type(fuel_type);
		
		manager.persist(pojo);
		
		transaction.commit();
		closeConnection();
		return pojo;
	}

	
}
