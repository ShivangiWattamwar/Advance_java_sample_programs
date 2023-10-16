package com.jspiders.hibernate.dao;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jspiders.hibernate.dto.EmployeeDTO;

public class EmployeeDAO2 
{
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("employee");
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
		
		EmployeeDTO emp1=new EmployeeDTO();
		emp1.setId(3);
		emp1.setName("Ram");
		emp1.setEmail("ram@gmail.com");
		emp1.setContact(9874561230L);
		emp1.setAddress("Pune");
		
		entityManager.persist(emp1);
		
		EmployeeDTO emp2=new EmployeeDTO();
		emp2.setId(4);
		emp2.setName("Shyam");
		emp2.setEmail("shyam@gmail.com");
		emp2.setContact(978520230L);
		emp2.setAddress("Kochi");
		
		entityManager.persist(emp2);
		
		entityTransaction.commit();
		closeConnection();
	}
}
