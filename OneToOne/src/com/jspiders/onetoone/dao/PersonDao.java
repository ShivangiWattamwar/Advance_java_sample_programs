package com.jspiders.onetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.onetoone.dto.AadharCard;
import com.jspiders.onetoone.dto.Person;

public class PersonDao {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("person");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}

	public static void main(String[] args) {

		openConnection();
		entityTransaction.begin();

		Person person = new Person();
		person.setId(3);
		person.setName("Rohan");
		person.setEmail("rohan@gmail.com");
		person.setDateOfBirth("03/8/2000");

		AadharCard aadharCard = new AadharCard();
		aadharCard.setId(3);
		aadharCard.setAadharNumber(855567854855l);
		aadharCard.setDateOfIssue("01/04/2016");

		person.setAadharCard(aadharCard);

		entityManager.persist(aadharCard);
		entityManager.persist(person);

		entityTransaction.commit();
		closeConnection();

	}

}


//for running this program change name of persistence-unit in persistence.xml file as person
//This is a one to one unidirectional program
//This file is created in weja2 database
