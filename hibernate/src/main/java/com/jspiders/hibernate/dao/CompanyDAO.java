package com.jspiders.hibernate.dao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.jspiders.hibernate.dto.Company;
import com.jspiders.hibernate.dto.Employee;


public class CompanyDAO 
{
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("person");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}
	private static void closeConnection()
	{
		if(entityManagerFactory !=null)
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
	
	public static void main(String[] args) 
	{
		openConnection();
		entityTransaction.begin();
		
		Company company=new Company();
		company.setId(1);
		company.setName("Infosys");
		company.setAddress("pune");
		company.setEmail("Infosys@gmail.com");
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("Ganesh");
		emp1.setEmail("ganesh@gmail.com");
		emp1.setSalary(35000.00);
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("Suresh");
		emp2.setEmail("suresh@gmail.com");
		emp2.setSalary(45000.00);
		
		Employee emp3=new Employee();
		emp3.setId(3);
		emp3.setName("Ramesh");
		emp3.setEmail("ramesh@gmail.com");
		emp3.setSalary(50000.00);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		company.setEmployees(employees);
		entityManager.persist(emp1);
		entityManager.persist(emp2);
		entityManager.persist(emp3);
		entityManager.persist(company);
		
		entityTransaction.commit();
		closeConnection();	
	}

}
