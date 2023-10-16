package com.jspiders.hibernate.dao;

import javax.persistence.EntityManagerFactory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.Company1;
import com.jspiders.hibernate.dto.Employee1;
public class Company1DAO 
{
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection()
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("Company1");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}
	
	private static void closeConnection()
	{
		if(entityManagerFactory!=null)
		{
			entityManagerFactory.close();
		}
		if(entityManager!=null)
		{
			entityManager.close();
		}
		if(entityTransaction!=null)
		{
			if(entityTransaction.isActive())
			{
				entityTransaction.rollback();
			}
		}
	}
	public static void main(String args[])
	{
		openConnection();
		entityTransaction.begin();
		
		Company1 company1=new Company1();
		company1.setId1(1);
		company1.setName1("Infosys");
		company1.setAddress1("Pune");
		company1.setEmail1("infosys@gmail.com");
		
		
		
		Employee1 employee1 =new Employee1();
		employee1.setId1(1);
		employee1.setName1("Komal");
		employee1.setEmail1("komal@gmail.com");
		employee1.setSalary1(400000);
		
		Employee1 employee2 =new Employee1();
		employee1.setId1(2);
		employee1.setName1("Gopal");
		employee1.setEmail1("gopal@gmail.com");
		employee1.setSalary1(250000);
		
		Employee1 employee3 =new Employee1();
		employee1.setId1(3);
		employee1.setName1("Girish");
		employee1.setEmail1("girish@gmail.com");
		employee1.setSalary1(350000);
		
		List<Employee1> employees=new ArrayList<Employee1>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		
		company1.setEmployees(employees);
		
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.persist(company1);
		
		entityTransaction.commit();
		closeConnection();
		
	}
}
